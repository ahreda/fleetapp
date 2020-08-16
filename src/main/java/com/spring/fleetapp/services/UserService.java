package com.spring.fleetapp.services;

import com.spring.fleetapp.models.User;
import com.spring.fleetapp.repositories.RoleReposetory;
import com.spring.fleetapp.repositories.UserRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final BCryptPasswordEncoder encoder;

    UserRepositories userRepositories;
    RoleService roleService;

    public UserService(BCryptPasswordEncoder encoder, UserRepositories userRepositories, RoleService roleService) {
        this.encoder = encoder;
        this.userRepositories = userRepositories;
        this.roleService = roleService;
    }

    public void save(User user){

        String password = user.getPassword();
        String secrete = encoder.encode(password);
        user.setPassword(secrete);
        user.addRole(roleService.findByName("User"));
        userRepositories.save(user);

    }
}
