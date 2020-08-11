package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Supplier;
import com.spring.fleetapp.repositories.SupplierRepositories;
import com.spring.fleetapp.services.CountryService;
import com.spring.fleetapp.services.StateService;
import com.spring.fleetapp.services.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SupplierController {


SupplierService supplierService;
CountryService countryService;
StateService stateService;

    public SupplierController(SupplierService supplierService, CountryService countryService, StateService stateService) {
        this.supplierService = supplierService;
        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping("/Suppliers")
    public String getSuppliers(Model model){
        model.addAttribute("suppliers", supplierService.getAllSuppliers());
        model.addAttribute("countries", countryService.getCountries());
        model.addAttribute("states", stateService.getStates());

        return "supplier";
    }


    @PostMapping("/Suppliers/addNewSupplier")
    public String addNewSupplier(Supplier supplier){

        supplierService.save(supplier);
        return"redirect:/Suppliers";
    }

}
