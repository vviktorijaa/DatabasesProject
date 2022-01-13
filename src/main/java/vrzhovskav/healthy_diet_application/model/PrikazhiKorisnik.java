package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Data
@Entity
//@Immutable
@Table(name = "prikazhi_korisnik", schema = "healthy_diet_application_database")
public class PrikazhiKorisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private Float height;
    private Float weight;
    private Float bmi;
    private Integer kcal_needed;
    private Integer kcal_consumed;
    private Integer water_consumed;

    public PrikazhiKorisnik(String username, Float height, Float weight, Float bmi, Integer kcal_needed, Integer kcal_consumed, Integer water_consumed) {
        this.username = username;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.kcal_needed = kcal_needed;
        this.kcal_consumed = kcal_consumed;
        this.water_consumed = water_consumed;
    }

    public PrikazhiKorisnik() {}
}
