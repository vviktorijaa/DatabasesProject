package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Diet", schema = "healthy_diet_application_database")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="diet_id")
    private Integer diet_id;
    private String diet_name;
    private String diet_desc;

    @ManyToMany(mappedBy = "recipeIsInDiet")
    private List<Recipe> dietHasRecipes;

    @ManyToMany(mappedBy = "userIsOnADiet")
    public List<User> users;

    public Diet(String diet_name, String diet_desc, List<Recipe> dietHasRecipes, List<User> users) {
        this.diet_name = diet_name;
        this.diet_desc = diet_desc;
        this.dietHasRecipes = dietHasRecipes;
        this.users = users;
    }

    public Diet() {}
}
