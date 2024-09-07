package sgr.compliance.sgr_backend.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sgr.compliance.sgr_backend.dtos.SgrDTO;

import java.util.List;

@RequestMapping("/sgr")
public interface SgrController {

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    SgrDTO findById(@PathVariable("id") Long id);

    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<SgrDTO> findAllSgrEntities();

    @PostMapping(value = "create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    SgrDTO createSgrEntity(@RequestBody SgrDTO sgrDTO);
}
