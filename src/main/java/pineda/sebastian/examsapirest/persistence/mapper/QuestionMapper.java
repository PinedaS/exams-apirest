package pineda.sebastian.examsapirest.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import pineda.sebastian.examsapirest.domain.dto.QuestionDTO;
import pineda.sebastian.examsapirest.persistence.entity.QuestionsEntity;

@Mapper(uses = {OptionMapper.class})
public interface QuestionMapper {
    QuestionsEntity toQuestionsEntity(QuestionDTO questionDTO);

    @InheritInverseConfiguration
    QuestionDTO toQuestionDTO(QuestionsEntity questionsEntity);
}
