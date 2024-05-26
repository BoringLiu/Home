package Service;

import Mapper.ItemMapper;
import Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService{
    Item findItemByID(int id);

    Boolean existsByID(int id);

    List<Item> BrowseAllItem();

    Boolean existsByName(String name);
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

}
