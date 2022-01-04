package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUsername(String username);

    void deleteUserByUsername(String username);
}
