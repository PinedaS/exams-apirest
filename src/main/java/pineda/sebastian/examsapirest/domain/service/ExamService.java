package pineda.sebastian.examsapirest.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import pineda.sebastian.examsapirest.domain.dto.ExamDTO;
import pineda.sebastian.examsapirest.domain.dto.QuestionDTO;
import pineda.sebastian.examsapirest.persistence.repository.ExamRepository;
import pineda.sebastian.examsapirest.web.exceptions.SizeOfSomeOptionIsDifferentThan4Exception;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExamService {
    @Autowired
    ExamRepository examRepository;

    public ExamDTO createExam(ExamDTO examDTO) {
        boolean sizeOfSomeOptionIsDifferentThan4 = false;
        Map<String, String> responseJsonIfError = new HashMap<>();

        for (QuestionDTO questionDTO : examDTO.getQuestions()) {
            if (questionDTO.getOptions().size() != 4) {
                sizeOfSomeOptionIsDifferentThan4 = true;
                break;
            }
        }

        if (sizeOfSomeOptionIsDifferentThan4 == false) {
            return examRepository.createExam(examDTO);
        } else {
            throw new SizeOfSomeOptionIsDifferentThan4Exception(
                    HttpStatusCode.valueOf(400),
                    "La cantidad de opciones de una pregunta deben ser estriscamente 4"
            );
        }
    }
}
