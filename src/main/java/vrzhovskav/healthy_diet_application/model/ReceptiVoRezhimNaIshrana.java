package vrzhovskav.healthy_diet_application.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "recepti_vo_rezhim_na_ishrana", schema = "healthy_diet_application_database")
public class ReceptiVoRezhimNaIshrana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String diet_name;
    private String name;

    public ReceptiVoRezhimNaIshrana(Integer id, String diet_name, String name) {
        this.id = id;
        this.diet_name = diet_name;
        this.name = name;
    }

    public ReceptiVoRezhimNaIshrana() {}
}
