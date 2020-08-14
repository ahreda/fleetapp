/*
package com.spring.fleetapp.DBLoader;


import com.spring.fleetapp.models.User;
import com.spring.fleetapp.repositories.UserRepositories;
import com.spring.fleetapp.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner{

    UserRepositories userRepositories;

    public DataBaseLoader(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    @Override
    public void run(String... args) throws Exception {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String userPass = encoder.encode("User.147");
        String adminPass= encoder.encode("Admin.147");

        User user1 = new User(1, "Reda", "Ahmd", "ahmadreda",userPass );
        User user2 = new User(3, "Ahmad", "Reda", "ahmadadmin",adminPass );
        User user3 = new User()

        userRepositories.save(user1);
        userRepositories.save(user2);
    }
}
*/