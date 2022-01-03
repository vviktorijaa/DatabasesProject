package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "prikazhi_recept", schema = "healthy_diet_application_database")
public class PrikazhiRecept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Long kcal;
}
