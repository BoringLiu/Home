package space.luming.home.Controller;


import space.luming.home.Entity.Item;
import space.luming.home.Service.ItemService;
//import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/All")
    public List<Item> BrowseAll(){
        return itemService.BrowseAllItem();
    }

    @PostMapping("/create")
    public int createitem(@RequestBody Item item){return itemService.createItem(item);}

    @DeleteMapping("/delete")
    public int deleteitem(@RequestParam int tid){return itemService.deleteItem(tid);}

    @PutMapping("/update")
    public int updateitem(@RequestParam int tid,@RequestBody Item item){
        return itemService.updateItem(tid,item);
    }

    @GetMapping("/search")
    public List<Item> searchItem(@RequestParam int method,@RequestParam String target){
        return itemService.searchItem(method,target);
    }

    @PostMapping("/CountChange")
    public int CountChange(@RequestParam int change,@RequestParam int tid){
        return itemService.ItemCountChange(tid,change);
    }

    @GetMapping("/analysis")
    public List<Item> analysis(){
        return itemService.analysis();
    }


}
