package pineda.sebastian.examsapirest.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import pineda.sebastian.examsapirest.persistence.entity.ExamsEntity;

public interface ExamCrudRepository extends CrudRepository<ExamsEntity, Integer> {
}
