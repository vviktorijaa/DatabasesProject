package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.repository.jpa.ReceptiVoRezhimNaIshranaRepository;

@Service
public class ReceptiVoRezhimNaIshranaServiceImpl {

    private final ReceptiVoRezhimNaIshranaRepository receptiVoRezhimNaIshranaRepository;

    public ReceptiVoRezhimNaIshranaServiceImpl(ReceptiVoRezhimNaIshranaRepository receptiVoRezhimNaIshranaRepository) {
        this.receptiVoRezhimNaIshranaRepository = receptiVoRezhimNaIshranaRepository;
    }

}
