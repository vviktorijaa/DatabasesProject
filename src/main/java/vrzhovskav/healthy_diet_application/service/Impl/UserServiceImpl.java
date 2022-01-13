package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.Diet;
import vrzhovskav.healthy_diet_application.model.Recipe;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.model.exceptions.UserNotFound;
import vrzhovskav.healthy_diet_application.repository.UserRepo;
import vrzhovskav.healthy_diet_application.repository.jpa.UserRepository;
import vrzhovskav.healthy_diet_application.service.UserService;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRepo userRepo;
//    private final UserIsOnADietRepository userIsOnADietRepository;
//    private final UserIsOnADietService userIsOnADietService;

    public UserServiceImpl(UserRepository userRepository, UserRepo userRepo) {
        this.userRepository = userRepository;
        this.userRepo = userRepo;
    }

    @Override
    public User save(String username, String password, Integer age, String gender, Float height, Float weight, String goal, String activity_rate, Integer kcal_needed, Float bmi, Integer kcalConsumed, Integer waterConsumed, List<Recipe> is_favourite, Set<Diet> userIsOnADiet) {
        User u = new User(username, password, age, gender, height, weight, goal, activity_rate, kcal_needed, bmi, kcalConsumed, waterConsumed, is_favourite, userIsOnADiet);
        return this.userRepository.save(u);
    }

    @Override
    public float calculateBMI(Float height, Float weight) {
        return this.userRepo.calculateBMI(height, weight);
    }

    @Override
    public int maxCalories(Integer age, String gender, Float height, Float weight, String activityRate, String userGoal) {
        return this.userRepo.calculateMaxCalories(age, gender, height, weight, activityRate, userGoal);
    }

    @Override
    public User updateWater(Integer id, Integer waterConsumed) {
        User u = this.findById(id);
        u.setWater_consumed(waterConsumed);
        return this.userRepository.save(u);
    }

    @Override
    public User updateKcal(Integer id, Integer kcal) {
        User u = this.findById(id);
        u.setKcal_consumed(kcal);
        return this.userRepository.save(u);
    }

    @Override
    public User updateFaveRecipe(Integer id, Recipe r) {
        User u = this.findById(id);
        List<Recipe> faves = u.getIs_favourite();
        faves.removeIf(recipe->recipe.getRecipe_id().equals(r.getRecipe_id()));
        faves.add(r);
        return this.userRepository.save(u);
    }

    @Override
    public User updateDiets(Integer id, Diet d) {
        User u = this.findById(id);
        Set<Diet> userDiets = u.getUserIsOnADiet();
        userDiets.add(d);
//        LocalDate fromDate = LocalDate.now();
//        UserIsOnADiet userIsOnADiet = new UserIsOnADiet();
//        userIsOnADiet.setFromDate(fromDate);
//        UserIsOnADiet userIsOnADiet1 = this.userIsOnADietService.update(u.getUsername_id(), fromDate);
        return this.userRepository.save(u);
    }

    @Override
    public User findById(Integer id) {
        return this.userRepository.findById(id).orElseThrow(UserNotFound::new);
    }

    @Override
    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
