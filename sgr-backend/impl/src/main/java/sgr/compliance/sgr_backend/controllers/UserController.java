package sgr.compliance.sgr_backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgr.compliance.sgr_backend.dtos.UserDTO;
import sgr.compliance.sgr_backend.services.IUserService;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController implements IUserController {

    private final IUserService userService;

    @Override
    public UserDTO findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
