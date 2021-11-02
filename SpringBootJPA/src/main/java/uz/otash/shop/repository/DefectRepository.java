package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Defect;

public interface DefectRepository extends JpaRepository<Defect,Integer> {
}
