package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.Diet;
import vrzhovskav.healthy_diet_application.repository.jpa.DietRepository;
import vrzhovskav.healthy_diet_application.service.DietService;
import java.util.List;

@Service
public class DietServiceImpl implements DietService {

    private final DietRepository dietRepository;

    public DietServiceImpl(DietRepository dietRepository) {
        this.dietRepository = dietRepository;
    }

    @Override
    public List<Diet> findAll() {
        return dietRepository.findAll();
    }
}
