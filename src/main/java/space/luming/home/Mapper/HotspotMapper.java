package space.luming.home.Mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import space.luming.home.Entity.Hotspot;

import java.util.List;

public interface HotspotMapper {
    @Select("select * from networkhotpot")
    List<Hotspot> BrowseAllHotspots();

    @Insert("INSERT INTO networkhotpot (hid, name, record_date, platform, example, reason, url) VALUES (#{hid}, #{name}, #{recorddate}, #{platform}, #{example}, #{reason}, #{url})")
    void createHotspot(Hotspot hotspot);
    @Select("select * from networkhotpot where name like concat ('%',#{name},'%')")
    List<Hotspot> findHotspotByName(String name);
    @Select("select count(*) > 0 from networkhotpot where name = #{name} ")
    Boolean existsByName(String name);
    @Delete("delete * from networkhotpot where name = #{name}")
    void deleteHotspot(String name);
}
