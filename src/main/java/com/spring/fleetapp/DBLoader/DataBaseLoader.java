/*
package com.spring.fleetapp.DBLoader;


import com.spring.fleetapp.models.Role;
import com.spring.fleetapp.repositories.RoleReposetory;
import com.spring.fleetapp.repositories.UserRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner{

    UserRepositories userRepositories;
    RoleReposetory roleReposetory;

    public DataBaseLoader(UserRepositories userRepositories, RoleReposetory roleReposetory) {
        this.userRepositories = userRepositories;
        this.roleReposetory = roleReposetory;
    }


    @Override
    public void run(String... args) throws Exception {

        Role userRole = new Role("ROLE_USER");
        roleReposetory.save(userRole);
        Role adminRole = new Role("ROLE_ADMIN");
        roleReposetory.save(adminRole);


        /*
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String userPass = encoder.encode("User.147");
        String adminPass= encoder.encode("Admin.147");

        User user1 = new User(1, "Reda", "Ahmd", "ahmadreda",userPass );
        User user2 = new User(3, "Ahmad", "Reda", "ahmadadmin",adminPass );
        User user3 = new User()

        userRepositories.save(user1);
        userRepositories.save(user2);
    }
}*/
