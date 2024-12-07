package space.luming.home.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.luming.home.Entity.PUBG_item;
import space.luming.home.Repository.PUBGItemRepository;

import java.util.List;

@Service
public class PUBGItemService {

    @Autowired
    private PUBGItemRepository pubgItemRepository;

    public List<PUBG_item> getAllItems() {
        return pubgItemRepository.findAll();
    }

    public PUBG_item getItemById(String oid) {
        return pubgItemRepository.findById(oid).orElse(null);
    }

    public PUBG_item createItem(PUBG_item item) {
        return pubgItemRepository.save(item);
    }

    public PUBG_item updateItem(String oid, PUBG_item item) {
        if (pubgItemRepository.existsById(oid)) {
            item.setOid(oid);
            return pubgItemRepository.save(item);
        }
        return null;
    }

    public void deleteItem(String oid) {
        pubgItemRepository.deleteById(oid);
    }
}
