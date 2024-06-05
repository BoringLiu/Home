package space.luming.home.Mapper;

import org.apache.ibatis.type.JdbcType;
import space.luming.home.Entity.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface ItemMapper {

    @Select("select * from ItemInfo where remove = 0")
    List<Item> BrowseAllItem();

    @Select("select name from ItemInfo where name like concat ('%',#{name},'%') and remove = 0")
    @Results({@Result(column="last_update",property="lastupdate",jdbcType= JdbcType.TIMESTAMP),})
    List<Item> findItemByName(String name);

    @Insert("INSERT INTO ItemInfo (tid, name, count, position, last_update, price, warning, `from`, remove, remark)\n" +
            "VALUES (#{tid}, #{name}, #{count}, #{position}, #{lastupdate}, #{price}, #{warning}, #{from}, #{remove}, #{remark})")
    void createItem(Item item);

    @Select("select * from ItemInfo where tid = #{tid} and remove = 0")
    @Results({@Result(column="last_update",property="lastupdate",jdbcType= JdbcType.TIMESTAMP),})
    Item findItemByID(int tid);

    @Select("select count(*) > 0 from ItemInfo where tid = #{tid} and remove = 0")
    Boolean existsByID(int tid);

    @Update("update ItemInfo set remove = 1 where tid = #{tid}")
    void deleteItem(int tid);

    @Select("select * from ItemInfo where name like concat('%',#{target},'%') or remark like concat('%',#{target},'%') and remove = 0")
    @Results({@Result(column="last_update",property="lastupdate",jdbcType= JdbcType.TIMESTAMP),})
    List<Item> findItemByFuzzy(String target);

    @Select("select count(*) > 0 from ItemInfo where name = #{name} and remove = 0")
    Boolean existsByName(String name);

}
