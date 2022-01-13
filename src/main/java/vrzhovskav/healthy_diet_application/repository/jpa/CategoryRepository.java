package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
