package sgr.compliance.sgr_backend.mappers;

import org.mapstruct.Mapper;
import sgr.compliance.sgr_backend.dtos.UserDTO;
import sgr.compliance.sgr_backend.entities.User;

@Mapper
public interface UserMapper {

    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);

}
