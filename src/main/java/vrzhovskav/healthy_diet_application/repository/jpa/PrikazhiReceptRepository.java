package vrzhovskav.healthy_diet_application.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vrzhovskav.healthy_diet_application.model.PrikazhiRecept;
import java.util.List;

public interface PrikazhiReceptRepository extends JpaRepository<PrikazhiRecept, String> {

    PrikazhiRecept findById(Integer id);

    List<PrikazhiRecept> findAllByNameLike(String text);
}
