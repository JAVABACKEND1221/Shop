package uz.otash.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.otash.shop.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
