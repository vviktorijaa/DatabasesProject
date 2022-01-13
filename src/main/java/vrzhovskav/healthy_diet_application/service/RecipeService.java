package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.Recipe;
import java.util.List;

public interface RecipeService {

    List<Recipe> findAll();

//    List<Recipe> findAllByNameOrCategory(String text, Integer c);
//
//    List<Recipe> findAllByCategory(Integer c);

    Recipe findById(Integer id);

}
