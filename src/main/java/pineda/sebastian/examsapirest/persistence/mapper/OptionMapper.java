package pineda.sebastian.examsapirest.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pineda.sebastian.examsapirest.domain.dto.OptionDTO;
import pineda.sebastian.examsapirest.persistence.entity.OptionsEntity;

@Mapper
public interface OptionMapper {
    OptionsEntity toOptionsEntity(OptionDTO optionDTO);

    @InheritInverseConfiguration
    OptionDTO toOptionDTO(OptionsEntity optionsEntity);
}
