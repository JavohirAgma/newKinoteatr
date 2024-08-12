package com.example.demo.config.security;


import com.example.demo.model.user.AuthUser;
import com.example.demo.model.user.Permission;
import com.example.demo.model.user.Role;
import com.example.demo.service.user.PermissionService;
import com.example.demo.service.user.RoleService;
import com.example.demo.service.user.UserService;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userRepo;
    private final RoleService roleRepo;
    private final PermissionService permissionRepo;

    public CustomUserDetailsService(UserService userRepo, RoleService roleRepo, PermissionService permissionRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.permissionRepo = permissionRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AuthUser> optional = userRepo.getByUsername(username);
        AuthUser authUser = optional.orElseThrow(() -> new BadCredentialsException("Username or password incorrect"));

        Integer id = authUser.getId();

        List<Role> roles = roleRepo.getByUser(id);

        Set<String> authorities  = new HashSet<>();
        for (Role role : roles) {
            authorities.add("ROLE_"+role.getCode());
            List<Permission> permissions = permissionRepo.getByRole(role.getId());
            for (Permission permission : permissions) {
                authorities.add(permission.getCode());
            }
        }


        String[] array = authorities.toArray(new String[authorities.size()]);
        UserDetails build = User
                .withUsername(authUser.getUsername())
                .password(authUser.getPassword())
                .authorities(array)
                .build();
        return build;
    }
}
