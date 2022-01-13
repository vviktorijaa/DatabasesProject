package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.Category;
import vrzhovskav.healthy_diet_application.model.PrikazhiRecept;
import vrzhovskav.healthy_diet_application.model.exceptions.CategoryNotFoundException;
import vrzhovskav.healthy_diet_application.repository.jpa.CategoryRepository;
import vrzhovskav.healthy_diet_application.repository.jpa.PrikazhiReceptRepository;
import vrzhovskav.healthy_diet_application.service.PrikazhiReceptService;
import java.util.List;

@Service
public class PrikazhiReceptServiceImpl implements PrikazhiReceptService {

    private final PrikazhiReceptRepository prikazhiReceptRepository;
    private final CategoryRepository categoryRepository;

    public PrikazhiReceptServiceImpl(PrikazhiReceptRepository prikazhiReceptRepository, CategoryRepository categoryRepository) {
        this.prikazhiReceptRepository = prikazhiReceptRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<PrikazhiRecept> findAll() {
        return this.prikazhiReceptRepository.findAll();
    }

    @Override
    public PrikazhiRecept findById(Integer id) {
        return this.prikazhiReceptRepository.findById(id);
    }

    @Override
    public List<PrikazhiRecept> findAllByName(String text) {
        if (text != null) {
            return this.prikazhiReceptRepository.findAllByNameLike("%" + text + "%");
        } else {
            return this.prikazhiReceptRepository.findAll();
        }
    }
}
