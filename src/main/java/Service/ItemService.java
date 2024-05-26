package Service;

import Mapper.ItemMapper;
import Entity.Item;
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
        if(findItemByName(item.getName()) != null) return 0;
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

}
