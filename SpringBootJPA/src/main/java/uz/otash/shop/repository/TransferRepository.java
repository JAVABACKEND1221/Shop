package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Transfer;

public interface TransferRepository extends JpaRepository<Transfer,Integer> {
}
