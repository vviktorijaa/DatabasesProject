package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vrzhovskav.healthy_diet_application.model.PrikazhiRecept;
import java.util.List;

@Repository
public interface PrikazhiReceptRepository extends JpaRepository<PrikazhiRecept, String> {

    @Override
    List<PrikazhiRecept> findAll();

    List<PrikazhiRecept> findAllByName(String name);

    PrikazhiRecept findById(Integer id);
}
