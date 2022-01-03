package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.Diet;
import java.util.List;

public interface DietRepository extends JpaRepository<Diet, Integer> {

    List<Diet> findAll();
}
