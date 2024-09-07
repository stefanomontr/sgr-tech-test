package sgr.compliance.sgr_backend.services;

import sgr.compliance.sgr_backend.dtos.SgrDTO;

import java.util.List;

public interface ISgrService {

    SgrDTO findSgrEntityById(Long id);
    List<SgrDTO> findAllSgrEntities();
    SgrDTO createSgrEntity(SgrDTO sgrDTO);

}
