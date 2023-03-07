package pineda.sebastian.examsapirest.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import pineda.sebastian.examsapirest.domain.dto.StudentDTO;
import pineda.sebastian.examsapirest.persistence.entity.StudentsEntity;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentsEntity toStudentsEntity(StudentDTO studentDTO);

    @InheritInverseConfiguration
    StudentDTO toStudentDTO(StudentsEntity studentsEntity);
}
