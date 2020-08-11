package com.spring.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/login")
    public String Login(){

        return "login";
    }

    @GetMapping("/logout")
    public String logout(){

        return "login";
    }

}
