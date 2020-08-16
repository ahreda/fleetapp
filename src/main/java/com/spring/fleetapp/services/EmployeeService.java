package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Employee;
import com.spring.fleetapp.models.State;
import com.spring.fleetapp.repositories.EmployeeRepositories;
import com.spring.fleetapp.repositories.EmployeeTypeRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {


EmployeeRepositories employeeRepositories;

    public EmployeeService(EmployeeRepositories employeeRepositories) {
        this.employeeRepositories = employeeRepositories;
    }

    public List<Employee> getAllEmployees() {

        return employeeRepositories.findAll();

    }

    public void save(Employee employee){
        employeeRepositories.save(employee);

    }

    public Optional<Employee> findStateById(Integer id){

        return employeeRepositories.findById(id);
    }

    public void deleteStateById(Integer id){

        employeeRepositories.deleteById(id);
    }

    public void deleteLocationById(int id) {

        employeeRepositories.deleteById(id);
    }

    public Employee findByUsername( String username) {
        return employeeRepositories.findByUsername(username);
    }
}
