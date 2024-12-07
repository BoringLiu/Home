package space.luming.home.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import space.luming.home.Entity.PUBG_item;

@Repository
public interface PUBGItemRepository extends JpaRepository<PUBG_item, String> {
}
