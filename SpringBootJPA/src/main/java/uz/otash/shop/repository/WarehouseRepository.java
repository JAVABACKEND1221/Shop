package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
