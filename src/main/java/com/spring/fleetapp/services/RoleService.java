package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Role;
import com.spring.fleetapp.repositories.RoleReposetory;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    RoleReposetory roleReposetory;

    public RoleService(RoleReposetory roleReposetory) {
        this.roleReposetory = roleReposetory;
    }

    public Role findByName(String name){
        return roleReposetory.findByName(name);
    }

}
