package Controller;


import Mapper.ItemMapper;
import Entity.Item;
import Service.ItemService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ItemController {

    @Autowired ItemMapper itemMapper;
    @Autowired ItemService itemService;

    @GetMapping("/item/All")
    public List<Item> BrowseAll(){
        return itemService.BrowseAllItem();
    }

    @PostMapping("/item/create")
    public int createitem(@RequestBody Item item){
        if(itemMapper.findItemByName(item.getName()) != null) return 0;
        itemMapper.createItem(item);
        return 1;
    }

    @DeleteMapping("/item/delete")
    public int deleteitem(@RequestParam int tid){
        if(itemMapper.existsByID(tid)) return 0;
        itemMapper.deleteItem(tid);
        return 1;
    }

    @PutMapping("/item/update")
    public int updateitem(@RequestParam int tid,@RequestBody Item item){
        if(itemMapper.findItemByID(tid) == null) return 0;
        itemMapper.deleteItem(tid);
        item.setTid(tid);
        itemMapper.createItem(item);
        return 1;
    }

    @GetMapping("/item/search")
    public List<Item> searchItem(@RequestParam int method,@RequestParam String target){
        List<Item> res = new ArrayList<Item>(){};
        if(method == 0){
            res.add(itemMapper.findItemByID(Integer.parseInt(target)));
        }else if(method == 1){
            res.add(itemMapper.findItemByName(target));
        }else{
            return itemMapper.findItemByFuzzy(target);
        }
        return res;
    }


}
