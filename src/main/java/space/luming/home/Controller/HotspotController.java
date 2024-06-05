package space.luming.home.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.luming.home.Entity.Hotspot;
import space.luming.home.Service.HotspotService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Hotspot")
public class HotspotController {
    @Autowired
    HotspotService hotspotService;

    @GetMapping("/All")
    public List<Hotspot> BrowseAll(){
        return hotspotService.BrowseAllHotspots();
    }

    @PostMapping("/create")
    public int createHotspot(@RequestBody Hotspot hotspot){return hotspotService.createHotspot(hotspot);}

    @DeleteMapping("/delete")
    public int deleteHotspot(@RequestParam String name){return hotspotService.deleteHotspot(name);}
//
//    @PutMapping("/update")
//    public int updateHotspot(@RequestParam int hid,@RequestBody Hotspot hotspot){
//        return hotspotService.updateHotspot(hid,otspot);
//    }

    @GetMapping("/search")
    public List<Hotspot> searchHotspot(@RequestParam String name){
        return hotspotService.searchHotspot(name);
    }
}
