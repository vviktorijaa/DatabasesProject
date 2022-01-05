package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.ReceptiVoRezhimNaIshrana;
import vrzhovskav.healthy_diet_application.repository.jpa.ReceptiVoRezhimNaIshranaRepository;
import vrzhovskav.healthy_diet_application.service.ReceptiVoRezhimNaIshranaService;

import java.util.List;
import java.util.Optional;

@Service
public class ReceptiVoRezhimNaIshranaServiceImpl implements ReceptiVoRezhimNaIshranaService {

    private final ReceptiVoRezhimNaIshranaRepository receptiVoRezhimNaIshranaRepository;

    public ReceptiVoRezhimNaIshranaServiceImpl(ReceptiVoRezhimNaIshranaRepository receptiVoRezhimNaIshranaRepository) {
        this.receptiVoRezhimNaIshranaRepository = receptiVoRezhimNaIshranaRepository;
    }

    @Override
    public Optional<ReceptiVoRezhimNaIshrana> findById(Integer id) {
        return this.receptiVoRezhimNaIshranaRepository.findById(id);
    }
}
