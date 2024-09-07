package sgr.compliance.sgr_backend.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sgr.compliance.sgr_backend.dtos.SgrDTO;
import sgr.compliance.sgr_backend.mappers.SgrMapper;
import sgr.compliance.sgr_backend.repositories.SgrRepository;
import sgr.compliance.sgr_backend.services.ISgrService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SgrService implements ISgrService {

    private final SgrRepository sgrRepository;
    private final SgrMapper sgrMapper;

    @Override
    public SgrDTO findSgrEntityById(Long id) {
        return sgrMapper.toSgrDTO(sgrRepository.findById(id).orElse(null));
    }

    @Override
    public List<SgrDTO> findAllSgrEntities() {
        return sgrRepository.findAll().stream()
                .map(sgrMapper::toSgrDTO)
                .toList();
    }

    @Override
    public SgrDTO createSgrEntity(SgrDTO sgrDTO) {
        return sgrMapper.toSgrDTO(sgrRepository.save(sgrMapper.toSgrEntity(sgrDTO)));

    }
}
