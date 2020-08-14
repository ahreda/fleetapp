package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Employee;
import com.spring.fleetapp.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    EmployeeService employeeService;
    CountryService countryService;
    StateService stateService;
    JobTitleService jobTitleService;
    EmployeeTypeService employeeTypeService;

    public EmployeeController(EmployeeService employeeService, CountryService countryService, StateService stateService, JobTitleService jobTitleService, EmployeeTypeService employeeTypeService) {
        this.employeeService = employeeService;
        this.countryService = countryService;
        this.stateService = stateService;
        this.jobTitleService = jobTitleService;
        this.employeeTypeService = employeeTypeService;
    }

    @GetMapping("/Employees")
    public String Employees(Model model){

        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees",employees);

        model.addAttribute("countries",countryService.getCountries());
        model.addAttribute("states",stateService.getStates());
        model.addAttribute("jobs",jobTitleService.getJobTitles());
        model.addAttribute("employeeTypes",employeeTypeService.getEmployeeTypes());

        return "employee";

    }

    @PostMapping("Employees/addNewEmployee")
    public String addNewEmployee(Employee employee){

        employeeService.save(employee);
        return "redirect:/Employees";
    }






}
