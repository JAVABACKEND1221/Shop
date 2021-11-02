package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Shop;

public interface ShopRepository extends JpaRepository<Shop,Integer> {
}
