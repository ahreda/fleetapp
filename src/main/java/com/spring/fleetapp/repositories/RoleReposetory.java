package com.spring.fleetapp.repositories;


import com.spring.fleetapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReposetory extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
