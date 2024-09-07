package sgr.compliance.sgr_backend.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sgr.compliance.sgr_backend.dtos.SgrDTO;

@RequestMapping("/srg")
public interface SgrController {

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    SgrDTO getById(@PathVariable("id") Long id);

    @PostMapping(value = "create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    SgrDTO createSgrEntity(@RequestBody SgrDTO sgrDTO);
}
