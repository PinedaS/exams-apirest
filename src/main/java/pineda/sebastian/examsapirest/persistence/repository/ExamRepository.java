package pineda.sebastian.examsapirest.persistence.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pineda.sebastian.examsapirest.domain.dto.ExamDTO;
import pineda.sebastian.examsapirest.persistence.crud.ExamCrudRepository;
import pineda.sebastian.examsapirest.persistence.entity.ExamsEntity;
import pineda.sebastian.examsapirest.persistence.entity.OptionsEntity;
import pineda.sebastian.examsapirest.persistence.entity.QuestionsEntity;
import pineda.sebastian.examsapirest.persistence.mapper.ExamMapper;

@Repository
public class ExamRepository {
    @Autowired
    private ExamCrudRepository examCrudRepository;

    public ExamDTO createExam(ExamDTO examDTO) {
        ExamsEntity exam = ExamMapper.INSTANCE.toExamsEntity(examDTO);
        QuestionsEntity question;
        OptionsEntity option;

        for (int i = 0; i < exam.getQuestions().size(); i++) {
            question = exam.getQuestions().get(i);
            question.setExam(exam);

            for (int j = 0; j < question.getOptions().size(); j++) {
                option = question.getOptions().get(j);
                option.setQuestion(question);
            }
        }

        exam = examCrudRepository.save(exam);
        examDTO = ExamMapper.INSTANCE.toExamDTO(exam);

        return examDTO;
    }
}
