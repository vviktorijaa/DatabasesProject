package vrzhovskav.healthy_diet_application.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    public float calculateBMI(Float height, Float weight){
        Float calculatedBMI = (weight/height/height)*10000;
        return calculatedBMI;
    }

    public double calculateBMR(Integer age, String gender, Float height, Float weight){
        double BMR=0;
        if(gender.equals("male")){
            BMR=88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        }
        else{
            BMR=447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }
        return BMR;
    }

    public int calculateMaxCalories(Integer age, String gender, Float height, Float weight, String activityRate, String userGoal){
        double maxCalories = 0;
        if(activityRate.equals("no") || activityRate.equals("onceAWeek")){
            maxCalories = calculateBMR(age, gender, height, weight) * 1.375;
            return (int) goal(maxCalories, userGoal);
        }
        else if(activityRate.equals("oneToThreeTimesAWeek")){
            maxCalories = calculateBMR(age, gender, height, weight) * 1.55;
            return (int) goal(maxCalories, userGoal);
        }
        else{
            maxCalories = calculateBMR(age, gender, height, weight) * 1.725;
            return (int) goal(maxCalories, userGoal);
        }
    }

    public double goal(double maxCalories, String goal){
        if(goal.equals("maintainWeight")){
            maxCalories = maxCalories * 1;
        }
        else if(goal.equals("loseWeight")){
            maxCalories = maxCalories * 0.75;
        }
        else if(goal.equals("loseWeight")){
            maxCalories = maxCalories * 1.25;
        }
        return maxCalories;
    }
}
