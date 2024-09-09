package sgr.compliance.sgr_backend.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class RoleDTO {

    private final Long id;
    private final String name;
    private final Set<UserDTO> users;

}
