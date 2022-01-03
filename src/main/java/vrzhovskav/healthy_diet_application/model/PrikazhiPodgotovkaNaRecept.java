package vrzhovskav.healthy_diet_application.model;

import javax.persistence.*;

@Entity
@Table(name = "prikazhi_podgotovka_na_recept", schema = "healthy_diet_application_database")
public class PrikazhiPodgotovkaNaRecept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String recipe_desc;
    private String ingredient;
}
