package space.luming.home.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.luming.home.Entity.Hotspot;
import space.luming.home.Mapper.HotspotMapper;

import java.util.List;

public interface HotspotService{

    List<Hotspot> BrowseAllHotspots();

    int createHotspot(Hotspot hotspot);
    List<Hotspot> searchHotspot(String name);
    int deleteHotspot(String name);
}

@Service
class HotspotImpl implements HotspotService {

    @Autowired
    private HotspotMapper hotspotMapper;

    @Override
    public List<Hotspot> BrowseAllHotspots(){
        return hotspotMapper.BrowseAllHotspots();
    }

    @Override
    public int createHotspot(Hotspot hotspot) {
        if(existsByName(hotspot.getName())) return 0;
        hotspotMapper.createHotspot(hotspot);
        return 1;
    }

    @Override
    public List<Hotspot> searchHotspot(String name) {
        return hotspotMapper.findHotspotByName(name);
    }

    public boolean existsByName(String name){
        return hotspotMapper.existsByName(name);
    }
    @Override
    public int deleteHotspot(String name) {
        if(existsByName(name)) return 0;
        hotspotMapper.deleteHotspot(name);
        return 1;
    }

}
