package com.spring.fleetapp.repositories;

import com.spring.fleetapp.models.Client;
import com.spring.fleetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {

}
