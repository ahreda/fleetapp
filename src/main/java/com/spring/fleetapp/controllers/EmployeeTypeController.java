package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.EmployeeType;
import com.spring.fleetapp.services.EmployeeService;
import com.spring.fleetapp.services.EmployeeTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeTypeController {

    EmployeeTypeService employeeService;

    public EmployeeTypeController(EmployeeTypeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/EmployeeTypes")
    public String employeeType(Model model){

        List<EmployeeType> employeeTypes = employeeService.getEmployeeTypes();
        model.addAttribute("employeeTypes", employeeTypes);


        return "employeeType";

    }


    @PostMapping("/EmployeeType/addNew")
    public String addEmployeeType( EmployeeType employeeType){

        employeeService.save(employeeType);

        return"redirect:/EmployeeTypes";
    }

}
