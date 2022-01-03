package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.repository.UserRepo;
import vrzhovskav.healthy_diet_application.repository.jpa.UserRepository;
import vrzhovskav.healthy_diet_application.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepository userRepository, UserRepo userRepo) {
        this.userRepository = userRepository;
        this.userRepo = userRepo;
    }

    @Override
    public User save(String username, String password, Integer age, String gender, Float height, Float weight, String goal, String activity_rate, Integer kcalNeeded, Float bmi) {
        User u = new User(username, password, age, gender, height, weight, goal, activity_rate, kcalNeeded, bmi);
        return this.userRepository.save(u);
    }

    @Override
    public float calculateBMI(Float height, Float weight) {
        return this.userRepo.calculateBMI(height, weight);
    }

    @Override
    public double calculateBMR(Integer age, String gender, Float height, Float weight) {
        return this.userRepo.calculateBMR(age, gender, height, weight);
    }

    @Override
    public int maxCalories(Integer age, String gender, Float height, Float weight, String activityRate, String userGoal) {
        return this.userRepo.calculateMaxCalories(age, gender, height, weight, activityRate, userGoal);
    }

}
