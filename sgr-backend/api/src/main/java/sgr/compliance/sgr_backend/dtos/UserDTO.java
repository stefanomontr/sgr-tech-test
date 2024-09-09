package sgr.compliance.sgr_backend.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder(toBuilder = true)
@Data
public class UserDTO {

    private final Long id;
    private final String username;
    private final String password;
    private final Set<RoleDTO> roles;

}
