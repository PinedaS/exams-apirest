package pineda.sebastian.examsapirest.persistence.repository;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pineda.sebastian.examsapirest.domain.dto.StudentDTO;
import pineda.sebastian.examsapirest.persistence.crud.StudentCrudRepository;
import pineda.sebastian.examsapirest.persistence.entity.StudentsEntity;
import pineda.sebastian.examsapirest.persistence.mapper.StudentMapper;

@Repository
public class StudentRepository {
    @Autowired
    private StudentCrudRepository studentCrudRepository;

    public StudentDTO createUser(StudentDTO studentDTO) {
        StudentsEntity student = StudentMapper.INSTANCE.toStudentsEntity(studentDTO);
        student = studentCrudRepository.save(student);
        studentDTO = StudentMapper.INSTANCE.toStudentDTO(student);

        return studentDTO;
    }
}
