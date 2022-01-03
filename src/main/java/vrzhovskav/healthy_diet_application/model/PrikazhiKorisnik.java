package vrzhovskav.healthy_diet_application.model;

import javax.persistence.*;

@Entity
@Table(name = "prikazhi_korisnik", schema = "healthy_diet_application_database")
public class PrikazhiKorisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    private Float height;
    private Float weight;
    private Float bmi;
    private Integer kcal_needed;
    private Integer kcal_consumed;
    private Integer water_consumed;
}
