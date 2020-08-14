package com.spring.fleetapp.services;

import com.spring.fleetapp.models.EmployeeType;
import com.spring.fleetapp.repositories.EmployeeTypeRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTypeService {

    EmployeeTypeRepositories employeeTypeRepositories;

    public EmployeeTypeService(EmployeeTypeRepositories employeeTypeRepositories) {
        this.employeeTypeRepositories = employeeTypeRepositories;
    }

    public List<EmployeeType>  getEmployeeTypes(){

        return employeeTypeRepositories.findAll();
    }


   public  void save(EmployeeType employeeType) {

        employeeTypeRepositories.save(employeeType);
   }
}
