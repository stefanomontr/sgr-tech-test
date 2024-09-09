package sgr.compliance.sgr_backend.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sgr.compliance.sgr_backend.dtos.UserDTO;
import sgr.compliance.sgr_backend.mappers.UserMapper;
import sgr.compliance.sgr_backend.repositories.RoleRepository;
import sgr.compliance.sgr_backend.repositories.UserRepository;
import sgr.compliance.sgr_backend.services.IUserService;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO findUserByUsername(String username) {
        // TODO manage entity not found
        return userMapper.toUserDTO(userRepository.findOneByUsername(username).orElse(null));
    }

    @Override
    @Transactional
    public UserDTO createUser(UserDTO userDTO) {
        if (userRepository.findOneByUsername(userDTO.getUsername()).isPresent()) {
            // TODO throw exception
        }

        // TODO manage role not found
        var validRoles = userDTO.getRoles().stream()
                .map(roleDTO -> roleRepository.findOneByName(roleDTO.getName()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        var newUser = userRepository.save(userMapper.toUser(userDTO));
        newUser.setRoles(validRoles);

        return userMapper.toUserDTO(newUser);
    }
}
