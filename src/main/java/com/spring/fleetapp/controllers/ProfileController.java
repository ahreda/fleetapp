package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Employee;
import com.spring.fleetapp.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    EmployeeService employeeService;

    public ProfileController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/profile")
    public String profile(Model model , Principal principal){

        String un = principal.getName();
        Employee employee = employeeService.findByUsername(un);
        model.addAttribute("employee",employee);

        return "profile";

    }
}
