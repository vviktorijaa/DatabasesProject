package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.PrikazhiKorisnik;

public interface PrikazhiKorisnikRepository extends JpaRepository<PrikazhiKorisnik, Integer> {

    PrikazhiKorisnik findByUsername(String username);

}
