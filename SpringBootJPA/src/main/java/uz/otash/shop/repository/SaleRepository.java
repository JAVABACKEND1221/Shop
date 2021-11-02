package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale,Integer> {
}
