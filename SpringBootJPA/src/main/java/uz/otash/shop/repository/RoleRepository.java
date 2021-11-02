package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
