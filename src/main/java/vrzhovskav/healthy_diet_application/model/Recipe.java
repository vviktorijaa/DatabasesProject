package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Recipe", schema = "healthy_diet_application_database")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recipe_id;
    private String name;
    private String recipe_desc;

    @ManyToMany(mappedBy = "is_favourite")
    private List<User> users;

    @ManyToMany
    @JoinTable(
            name = "is_in",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "diet_id"))
    private List<Diet> recipeIsInDiet;

    @ManyToMany
    @JoinTable(
            name = "belongs",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> recipeIsInCategory;

    @ManyToMany
    @JoinTable(
            name = "contains",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> recipeHasIngredients;

    public Recipe(String name, String recipe_desc, List<User> users, List<Diet> recipeIsInDiet, List<Category> recipeIsInCategory, List<Ingredient> recipeHasIngredients) {
        this.name = name;
        this.recipe_desc = recipe_desc;
        this.users = users;
        this.recipeIsInDiet = recipeIsInDiet;
        this.recipeIsInCategory = recipeIsInCategory;
        this.recipeHasIngredients = recipeHasIngredients;
    }

    public Recipe() {}
}
