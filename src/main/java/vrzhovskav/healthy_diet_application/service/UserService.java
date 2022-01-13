package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.Diet;
import vrzhovskav.healthy_diet_application.model.Recipe;
import vrzhovskav.healthy_diet_application.model.User;
import java.util.List;
import java.util.Set;

public interface UserService {

    User save(String username, String password, Integer age, String gender, Float height, Float weight, String goal, String activity_rate, Integer kcal_needed, Float bmi, Integer kcalConsumed, Integer waterConsumed, List<Recipe> is_favourite, Set<Diet> userIsOnADiet);

    float calculateBMI(Float height, Float weight);

    int maxCalories(Integer age, String gender, Float height, Float weight, String activityRate, String userGoal);

    User updateKcal(Integer id, Integer kcal);

    User updateWater(Integer id, Integer waterConsumed);

    User updateFaveRecipe(Integer id, Recipe r);

    User updateDiets(Integer id, Diet d);

    User findById(Integer id);

    User findByUsername(String username);
}
