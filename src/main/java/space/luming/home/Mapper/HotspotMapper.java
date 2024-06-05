package space.luming.home.Mapper;

import space.luming.home.Entity.Hotspot;

import java.util.List;

public interface HotspotMapper {
    List<Hotspot> BrowseAllHotspots();

    void createHotspot(Hotspot hotspot);

    List<Hotspot> findHotspotByName(String name);

    void deleteHotspot(String name);
}
