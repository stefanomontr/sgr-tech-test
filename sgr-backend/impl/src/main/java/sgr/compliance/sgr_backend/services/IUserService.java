package sgr.compliance.sgr_backend.services;

import sgr.compliance.sgr_backend.dtos.UserDTO;

public interface IUserService {

    UserDTO findUserByUsername(String username);
    UserDTO createUser(UserDTO userDTO);

}
