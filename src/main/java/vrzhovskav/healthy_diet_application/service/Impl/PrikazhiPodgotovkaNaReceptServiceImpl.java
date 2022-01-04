package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.PrikazhiPodgotovkaNaRecept;
import vrzhovskav.healthy_diet_application.repository.jpa.PrikazhiPodgotovkaNaReceptRepository;
import vrzhovskav.healthy_diet_application.service.PrikazhiPodgotovkaNaReceptService;

@Service
public class PrikazhiPodgotovkaNaReceptServiceImpl implements PrikazhiPodgotovkaNaReceptService {

    private final PrikazhiPodgotovkaNaReceptRepository prikazhiPodgotovkaNaReceptRepository;

    public PrikazhiPodgotovkaNaReceptServiceImpl(PrikazhiPodgotovkaNaReceptRepository prikazhiPodgotovkaNaReceptRepository) {
        this.prikazhiPodgotovkaNaReceptRepository = prikazhiPodgotovkaNaReceptRepository;
    }

    @Override
    public PrikazhiPodgotovkaNaRecept findById(Integer id) {
        return this.prikazhiPodgotovkaNaReceptRepository.findById(id);
    }
}
