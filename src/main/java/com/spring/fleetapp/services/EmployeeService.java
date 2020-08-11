package com.spring.fleetapp.services;

import com.spring.fleetapp.models.User;
import com.spring.fleetapp.repositories.UserRepositories;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Service
    public static class UserDetailsImp implements UserDetailsService {

        UserRepositories userRepositories;

        public UserDetailsImp(UserRepositories userRepositories) {
            this.userRepositories = userRepositories;
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


            Optional<User> user = userRepositories.findByUsername(username);
            if (!user.isPresent()){
                throw new UsernameNotFoundException(username);
            }

                return (UserDetails) user.get();
        }


        /*
        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user = userRepositories.findByUsername(username);

            if (user == null){
                throw  new UsernameNotFoundException("User Not found");
            }
            return new UserPrincipal(user);
        }

         */
    }
}
