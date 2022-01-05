package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.ReceptiVoRezhimNaIshrana;
import java.util.Optional;

public interface ReceptiVoRezhimNaIshranaService {

    Optional<ReceptiVoRezhimNaIshrana> findById(Integer id);
}
