package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.PrikazhiKorisnik;
import vrzhovskav.healthy_diet_application.repository.jpa.PrikazhiKorisnikRepository;
import vrzhovskav.healthy_diet_application.service.PrikazhiKorisnikService;

@Service
public class PrikazhiKorisnikServiceImpl implements PrikazhiKorisnikService {

    private final PrikazhiKorisnikRepository prikazhiKorisnikRepository;

    public PrikazhiKorisnikServiceImpl(PrikazhiKorisnikRepository prikazhiKorisnikRepository) {
        this.prikazhiKorisnikRepository = prikazhiKorisnikRepository;
    }

    @Override
    public PrikazhiKorisnik findUser(String username) {
        return this.prikazhiKorisnikRepository.findByUsername(username);
    }
}
