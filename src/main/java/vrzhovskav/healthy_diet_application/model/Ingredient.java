package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Ingredient", schema = "healthy_diet_application_database")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ingredient_id;
    private String ingredient_name;
    private Integer kcal;

    @ManyToMany(mappedBy = "recipeHasIngredients")
    private Set<Recipe> ingredientIsInRecipe;

    public Ingredient(String ingredient_name, Integer kcal, Set<Recipe> ingredientIsInRecipe) {
        this.ingredient_name = ingredient_name;
        this.kcal = kcal;
        this.ingredientIsInRecipe = ingredientIsInRecipe;
    }

    public Ingredient() {}
}
