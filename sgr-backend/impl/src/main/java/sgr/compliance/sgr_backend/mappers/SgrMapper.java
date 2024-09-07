package sgr.compliance.sgr_backend.mappers;

import org.mapstruct.Mapper;
import sgr.compliance.sgr_backend.dtos.SgrDTO;
import sgr.compliance.sgr_backend.entities.SgrEntity;

@Mapper
public interface SgrMapper {

    SgrDTO toSgrDTO(SgrEntity sgrEntity);
    SgrEntity toSgrEntity(SgrDTO sgrDTO);

}
