package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vrzhovskav.healthy_diet_application.model.ReceptiVoRezhimNaIshrana;

@Repository
public interface ReceptiVoRezhimNaIshranaRepository extends JpaRepository<ReceptiVoRezhimNaIshrana, Integer> {

}
