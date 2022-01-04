package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "prikazhi_podgotovka_na_recept", schema = "healthy_diet_application_database")
public class PrikazhiPodgotovkaNaRecept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String recipe_desc;
    private String ingredient;

    public PrikazhiPodgotovkaNaRecept(Integer id, String name, String recipe_desc, String ingredient) {
        this.id = id;
        this.name = name;
        this.recipe_desc = recipe_desc;
        this.ingredient = ingredient;
    }

    public PrikazhiPodgotovkaNaRecept() {}
}
