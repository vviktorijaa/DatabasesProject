package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "prikazhi_recept", schema = "healthy_diet_application_database")
public class PrikazhiRecept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Long kcal;

    public PrikazhiRecept(Integer id, String name, Long kcal) {
        this.id = id;
        this.name = name;
        this.kcal = kcal;
    }

    public PrikazhiRecept() {}
}
