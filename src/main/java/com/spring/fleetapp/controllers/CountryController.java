package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.services.CountryService;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CountryController {

    CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/Countries")
    public String getCountries(Model model){
        List<Country> countries = countryService.getCountries();
        model.addAttribute("countries", countries);
        return "country";
    }

    @PostMapping("/Countries/addNew")
    public String addNewCountry(Country country, RedirectAttributes redirectAttributes){

           countryService.save(country);
           redirectAttributes
                 .addFlashAttribute("success", true);
            return "redirect:/Countries";
    }


}
