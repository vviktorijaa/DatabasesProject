package vrzhovskav.healthy_diet_application.model;

import javax.persistence.*;

@Entity
@Table(name = "recepti_vo_rezhim_na_ishrana", schema = "healthy_diet_application_database")
public class ReceptiVoRezhimNaIshrana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String diet_name;
    private String name;
}
