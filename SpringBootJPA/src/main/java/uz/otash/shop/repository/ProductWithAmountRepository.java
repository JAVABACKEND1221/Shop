package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.ProductWithAmount;

public interface ProductWithAmountRepository extends JpaRepository<ProductWithAmount,Integer> {
}
