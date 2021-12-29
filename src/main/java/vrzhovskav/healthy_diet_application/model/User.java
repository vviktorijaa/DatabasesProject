package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer username_id;
    private String username;
    private String password;
    private String gender;
    private Float height;
    private Float weight;
    private String goal;
    private String activity_rate;
    private Integer kcal_needed;
    private Float bmi;
    private Integer kcal_consumed;
    private Integer water_consumed;

    @ManyToMany
    @JoinTable(
            name = "chooses",
            joinColumns = @JoinColumn(name = "username_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private List<Recipe> is_favourite;

    @ManyToMany
    @JoinTable(
            name = "is_on",
            joinColumns = @JoinColumn(name = "username_id"),
            inverseJoinColumns = @JoinColumn(name = "diet_id"))
    private List<Diet> userIsOnADiet;

    public User(String username, String password, String gender, Float height, Float weight, String goal, String activity_rate, Integer kcal_needed, Float bmi, Integer kcal_consumed, Integer water_consumed, List<Recipe> is_favourite, List<Diet> userIsOnADiet) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
        this.activity_rate = activity_rate;
        this.kcal_needed = kcal_needed;
        this.bmi = bmi;
        this.kcal_consumed = kcal_consumed;
        this.water_consumed = water_consumed;
        this.is_favourite = is_favourite;
        this.userIsOnADiet = userIsOnADiet;
    }

    public User() {}
}
