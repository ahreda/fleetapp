package com.spring.fleetapp.services;

import com.spring.fleetapp.models.EmployeeType;
import com.spring.fleetapp.repositories.EmployeeTypeRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

   public Optional<EmployeeType> getEmployeeTypeById(Integer id){
        return employeeTypeRepositories.findEmployeeTypeById(id);
   }

   public void deleteEmpType(Integer id){

        employeeTypeRepositories.deleteById(id);

   }

}
