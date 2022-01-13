package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.Recipe;
import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
//
//    List<Recipe> findAllByNameLike(String text);
//
//    List<Recipe> findAllByRecipeIsInCategory(String c);
//
//    List<Recipe> findAllByNameAndRecipeIsInCategory(String text, String c);
}
