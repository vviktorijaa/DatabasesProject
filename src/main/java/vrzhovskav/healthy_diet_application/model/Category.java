package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Category", schema = "healthy_diet_application_database")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;
    private String category_name;

    @ManyToMany(mappedBy = "recipeIsInCategory")
    private Set<Recipe> recipes;

    public Category(String category_name, Set<Recipe> recipes) {
        this.category_name = category_name;
        this.recipes = recipes;
    }

    public Category() {}
}
