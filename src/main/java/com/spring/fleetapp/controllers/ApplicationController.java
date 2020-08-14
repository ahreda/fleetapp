package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.User;
import com.spring.fleetapp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@Controller
public class ApplicationController {

    UserService userService;

    public ApplicationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String Login() {

        return "login";
    }

    @GetMapping("/logout")
    public String logout() {

        return "login";
    }


    @GetMapping("/register")
    public String register() {

        return "register";
    }

   /*
    @PostMapping(value="users/addNew")
    public RedirectView addNew(User user, RedirectAttributes redirectAttributes) {

        userService.save(user);

        RedirectView  redirectView= new RedirectView("/login",true);
        redirectAttributes.
                addFlashAttribute("message", "You successfully registered! You can now login");

        return redirectView;
    } */


    @PostMapping("/register")
    public String addNew(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            model.addAttribute("validationErrors", bindingResult.getAllErrors());

            return "register";
        } else

            userService.save(user);

        RedirectView  redirectView= new RedirectView("/login",true);
        redirectAttributes.
                addFlashAttribute("message", "You successfully registered! You can now login");
        return "redirect:/login";

    }
}
