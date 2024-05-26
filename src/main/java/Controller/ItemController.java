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

    @Autowired ItemService itemService;

    @GetMapping("/item/All")
    public List<Item> BrowseAll(){
        return itemService.BrowseAllItem();
    }

    @PostMapping("/item/create")
    public int createitem(@RequestBody Item item){return itemService.createItem(item);}

    @DeleteMapping("/item/delete")
    public int deleteitem(@RequestParam int tid){return itemService.deleteItem(tid);}

    @PutMapping("/item/update")
    public int updateitem(@RequestParam int tid,@RequestBody Item item){
        return itemService.updateItem(tid,item);
    }

    @GetMapping("/item/search")
    public List<Item> searchItem(@RequestParam int method,@RequestParam String target){
        return itemService.searchItem(method,target);
    }


}
