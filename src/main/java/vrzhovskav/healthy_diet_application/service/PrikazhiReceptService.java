package vrzhovskav.healthy_diet_application.service;

import vrzhovskav.healthy_diet_application.model.PrikazhiRecept;
import java.util.List;

public interface PrikazhiReceptService {

    List<PrikazhiRecept> findAll();

    List<PrikazhiRecept> findAllByName(String text);

    PrikazhiRecept findById(Integer id);
}
