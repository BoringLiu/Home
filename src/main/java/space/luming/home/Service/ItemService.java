package space.luming.home.Service;

import space.luming.home.Mapper.ItemMapper;
import space.luming.home.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface ItemService{
    Item findItemByID(int id);

    Boolean existsByID(int id);

    List<Item> BrowseAllItem();

    Boolean existsByName(String name);

    List<Item> findItemByName(String name);

    int createItem(Item item);

    List<Item> findItemByFuzzy(String target);

    List<Item> searchItem(int method, String target);

    int deleteItem(int tid);

    int updateItem(int tid, Item item);

    int ItemCountChange(int tid, int count);

    List<Item> analysis();
}
@Service
class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> BrowseAllItem(){
        return itemMapper.BrowseAllItem();
    }

    @Override
    public Item findItemByID(int id){
        return itemMapper.findItemByID(id);
    }

    @Override
    public Boolean existsByID(int id){
        return itemMapper.existsByID(id);
    }

    @Override
    public Boolean existsByName(String name){
        return itemMapper.existsByName(name);
    }

    @Override
    public List<Item> findItemByName(String name) {
        return itemMapper.findItemByName(name);
    }

    @Override
    public int createItem(Item item) {
        if(existsByName(item.getName())) return 0;
        itemMapper.createItem(item);
        return 1;
    }

    @Override
    public List<Item> findItemByFuzzy(String target) {
        return itemMapper.findItemByFuzzy(target);
    }

    @Override
    public List<Item> searchItem(int method, String target) {
        List<Item> res = new ArrayList<Item>(){};
        if(method == 0){
            res.add(findItemByID(Integer.parseInt(target)));
            System.out.println(res.get(0).getLastupdate());
        }else if(method == 1){
            return findItemByName(target);
        }else{
            return findItemByFuzzy(target);
        }
        return res;
    }

    @Override
    public int deleteItem(int tid) {
        if(findItemByID(tid) == null) return 0;
        itemMapper.deleteItem(tid);
        return 1;
    }

    @Override
    public int updateItem(int tid, Item item) {
        if(!existsByID(tid)) return 0;
        deleteItem(tid);
        createItem(item);
        return 1;
    }

    @Override
    public int ItemCountChange(int tid, int count){
        if(!existsByID(tid)) return 0;
        Item update = findItemByID(tid);
        if((update.getCount() + count) < 0) return 0;
        update.setCount(update.getCount() + count);
        updateItem(tid,update);
        return 1;
    }

    @Override
    public List<Item> analysis() {
        List<Item> res = null;
        List<Item> n = BrowseAllItem();
        for(Item i : n){
//            if(i.getLast_update())
        }

        return res;
    }

}
