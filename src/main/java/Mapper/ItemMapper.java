package Mapper;

import Entity.Item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper {


    @Select("select * from ItemInfo")
    List<Item> BrowseAllItem();

    @Select("select name from ItemInfo where name = #{name}")
    Item findItemByName(String name);

    @Insert("")
    void createItem(Item item);

    @Select("select * from ItemInfo where tid = #{tid}")
    Item findItemByID(int tid);

    @Select("select count(*) > 0 from ItemInfo where tid = #{tid}")
    Boolean existsByID(int tid);

    @Delete("delete * from ItemInfo where tid = #{tid}")
    void deleteItem(int tid);

    @Select("select * from ItemInfo where name like concat('%',#{target},'%') or remarks like concat('%',#{target},'%') or category like concat('%',#{target},'%')")
    List<Item> findItemByFuzzy(String target);

    @Select("select count(*) > 0 from ItemInfo where name = #{name}")
    Boolean existsByName(String name);
//    @Insert("insert into ItemInfo")

}
