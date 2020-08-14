package com.spring.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String profile(Model model , Principal principal){

        return "profile";

    }
}
