package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.PrikazhiKorisnik;

public interface PrikazhiKorisnikService {

    PrikazhiKorisnik findUser(String username);
}
