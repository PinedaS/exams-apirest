package pineda.sebastian.examsapirest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pineda.sebastian.examsapirest.domain.dto.ExamDTO;
import pineda.sebastian.examsapirest.persistence.repository.ExamRepository;

@Service
public class ExamService {
    @Autowired
    ExamRepository examRepository;

    public ExamDTO createExam(ExamDTO examDTO) {

        return examRepository.createExam(examDTO);
    }
}
