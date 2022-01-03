package vrzhovskav.healthy_diet_application.model;

import javax.persistence.*;

@Entity
@Table(name = "omileni_recepti_po_korisnik", schema = "healthy_diet_application_database")
public class OmileniReceptiPoKorisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String username;
    private Integer recipe_id;
    private String recipe_name;
}
