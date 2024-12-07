package space.luming.home.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.luming.home.Entity.PUBG_item;
import space.luming.home.Service.PUBGItemService;

import java.util.List;

@RestController
@RequestMapping("/pubg/order")
public class PUBGOrderController {

    @Autowired
    private PUBGItemService pubgItemService;

    @GetMapping
    public List<PUBG_item> getAllItems() {
        return pubgItemService.getAllItems();
    }

    @GetMapping("/{oid}")
    public PUBG_item getItemById(@PathVariable String oid) {
        return pubgItemService.getItemById(oid);
    }

    @PostMapping
    public PUBG_item createItem(@RequestBody PUBG_item item) {
        return pubgItemService.createItem(item);
    }

    @PutMapping("/{oid}")
    public PUBG_item updateItem(@PathVariable String oid, @RequestBody PUBG_item item) {
        return pubgItemService.updateItem(oid, item);
    }

    @DeleteMapping("/{oid}")
    public void deleteItem(@PathVariable String oid) {
        pubgItemService.deleteItem(oid);
    }
}
