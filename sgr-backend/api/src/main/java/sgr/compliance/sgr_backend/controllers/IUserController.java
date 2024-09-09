package sgr.compliance.sgr_backend.controllers;

import org.springframework.web.bind.annotation.*;
import sgr.compliance.sgr_backend.dtos.UserDTO;

@RequestMapping("users")
public interface IUserController {

    @GetMapping("{username}")
    UserDTO findUserByUsername(@PathVariable("username") String username);

    @PostMapping("create")
    UserDTO createUser(@RequestBody UserDTO userDTO);

}
