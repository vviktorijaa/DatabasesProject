package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.PrikazhiRecept;
import vrzhovskav.healthy_diet_application.repository.jpa.PrikazhiReceptRepository;
import vrzhovskav.healthy_diet_application.service.PrikazhiReceptService;
import java.util.List;

@Service
public class PrikazhiReceptServiceImpl implements PrikazhiReceptService {

    private final PrikazhiReceptRepository prikazhiReceptRepository;

    public PrikazhiReceptServiceImpl(PrikazhiReceptRepository prikazhiReceptRepository) {
        this.prikazhiReceptRepository = prikazhiReceptRepository;
    }

    @Override
    public List<PrikazhiRecept> findAll() {
        return this.prikazhiReceptRepository.findAll();
    }

    @Override
    public List<PrikazhiRecept> findAllByName(String text) {
        return prikazhiReceptRepository.findAllByNameLike(text);
    }

    @Override
    public PrikazhiRecept findById(Integer id) {
        return this.prikazhiReceptRepository.findById(id);
    }
}
