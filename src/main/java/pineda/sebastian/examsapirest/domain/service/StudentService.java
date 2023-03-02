package pineda.sebastian.examsapirest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pineda.sebastian.examsapirest.domain.dto.StudentDTO;
import pineda.sebastian.examsapirest.persistence.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO createStudent(StudentDTO studentDTO) {
        return studentRepository.createUser(studentDTO);
    }
}
