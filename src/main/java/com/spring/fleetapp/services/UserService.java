package com.spring.fleetapp.services;

import com.spring.fleetapp.models.User;
import com.spring.fleetapp.repositories.UserRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final BCryptPasswordEncoder encoder;

    UserRepositories userRepositories;

    public UserService(BCryptPasswordEncoder encoder, UserRepositories userRepositories) {
        this.encoder = encoder;
        this.userRepositories = userRepositories;
    }

    public void save(User user){

        String password = user.getPassword();
        String secrete = encoder.encode(password);
        user.setPassword(secrete);
        userRepositories.save(user);

    }
}
