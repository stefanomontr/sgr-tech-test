package sgr.compliance.sgr_backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sgr.compliance.sgr_backend.dtos.SgrDTO;
import sgr.compliance.sgr_backend.mappers.SgrMapper;
import sgr.compliance.sgr_backend.repositories.SgrRepository;

@RestController
@RequestMapping("/srg")
@RequiredArgsConstructor
public class SgrControllerImpl implements SgrController {

    private final SgrRepository sgrRepository;
    private final SgrMapper sgrMapper;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SgrDTO getById(@PathVariable("id") Long id) {
        return sgrMapper.toSgrDTO(sgrRepository.findById(id).orElse(null));
    }

    @PostMapping(value = "create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SgrDTO createSgrEntity(@RequestBody SgrDTO sgrDTO) {
        return sgrMapper.toSgrDTO(sgrRepository.save(sgrMapper.toSgrEntity(sgrDTO)));
    }

}
