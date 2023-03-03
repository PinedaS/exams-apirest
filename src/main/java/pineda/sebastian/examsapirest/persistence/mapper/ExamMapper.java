package pineda.sebastian.examsapirest.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pineda.sebastian.examsapirest.domain.dto.ExamDTO;
import pineda.sebastian.examsapirest.persistence.entity.ExamsEntity;

@Mapper(uses = {QuestionMapper.class})
public interface ExamMapper {
    ExamMapper INSTANCE = Mappers.getMapper(ExamMapper.class);

    ExamsEntity toExamsEntity(ExamDTO examDTO);

    @InheritInverseConfiguration
    ExamDTO toExamDTO(ExamsEntity examsEntity);

}
