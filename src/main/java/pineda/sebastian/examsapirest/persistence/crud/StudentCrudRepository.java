package pineda.sebastian.examsapirest.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import pineda.sebastian.examsapirest.persistence.entity.StudentsEntity;

public interface StudentCrudRepository extends CrudRepository<StudentsEntity, Integer> {
}
