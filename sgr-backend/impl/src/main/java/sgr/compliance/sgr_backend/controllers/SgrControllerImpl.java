package sgr.compliance.sgr_backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sgr.compliance.sgr_backend.dtos.SgrDTO;
import sgr.compliance.sgr_backend.services.ISgrService;

import java.util.List;

@RestController
@RequestMapping("/sgr")
@RequiredArgsConstructor
public class SgrControllerImpl implements SgrController {

    private final ISgrService sgrService;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SgrDTO findById(@PathVariable("id") Long id) {
        return sgrService.findSgrEntityById(id);
    }

    @Override
    public List<SgrDTO> findAllSgrEntities() {
        return sgrService.findAllSgrEntities();
    }

    @PostMapping(value = "create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SgrDTO createSgrEntity(@RequestBody SgrDTO sgrDTO) {
        return sgrService.createSgrEntity(sgrDTO);
    }

}
