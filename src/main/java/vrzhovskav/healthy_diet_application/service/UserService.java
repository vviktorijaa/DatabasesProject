package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.User;

public interface UserService {

    User save(String username,
              String password,
              Integer age,
              String gender,
              Float height,
              Float weight,
              String goal,
              String activity_rate,
              Integer kcal_needed,
              Float bmi,
              Integer kcal_consumed);

    float calculateBMI(Float height, Float weight);

    double calculateBMR(Integer age, String gender, Float height, Float weight);

    int maxCalories(Integer age, String gender, Float height, Float weight, String activityRate, String userGoal);

    User findByUsername(String text);

    void deleteByUsername(String text);

    User save(String username, String password, Integer age, String gender, Float height, Float weight, String goal, String activity_rate, Integer kcal_needed, Float bmi, Integer kcalConsumed, Integer waterConsumed);
}
