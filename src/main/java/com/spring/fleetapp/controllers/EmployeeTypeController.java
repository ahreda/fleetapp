package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.models.EmployeeType;
import com.spring.fleetapp.services.EmployeeService;
import com.spring.fleetapp.services.EmployeeTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {

    EmployeeTypeService employeeTypeServiceService;

    public EmployeeTypeController(EmployeeTypeService employeeService) {
        this.employeeTypeServiceService = employeeService;
    }

    @GetMapping("/EmployeeTypes")
    public String employeeType(Model model){

        List<EmployeeType> employeeTypes = employeeTypeServiceService.getEmployeeTypes();
        model.addAttribute("employeeTypes", employeeTypes);


        return "employeeType";

    }


    @PostMapping("/EmployeeType/addNew")
    public String addEmployeeType( EmployeeType employeeType){

        employeeTypeServiceService.save(employeeType);

        return"redirect:/EmployeeTypes";
    }


    @GetMapping("/EmployeeType/EmployeeTypeId")
    @ResponseBody
    public Optional<EmployeeType> getEmployeeType(Integer id){

        return employeeTypeServiceService.getEmployeeTypeById(id);

    }

    @RequestMapping(value="/EmployeeType/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateEmpType(EmployeeType employeeType){

        employeeTypeServiceService.save(employeeType);
        return "redirect:/EmployeeTypes";


    }

    @RequestMapping(value = "/EmployeeType/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteEmployeeType(Integer id ){

        employeeTypeServiceService.deleteEmpType(id);
        return"redirect:/EmployeeTypes";

    }





}
