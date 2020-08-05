package com.spring.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleDateController {

    @GetMapping("/VehicleDate")
    public String VehicleDate(){

        return "VehicleDate";

    }

}
