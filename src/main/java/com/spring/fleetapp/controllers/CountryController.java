package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.services.CountryService;
import org.aspectj.weaver.patterns.TypeVariablePattern;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

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

  //@GetMapping("/Countries/countryId/{id}")
    @GetMapping("/Countries/countryId")
    @ResponseBody
  //public  Optional<Country> getCountry(@PathVariable Integer id)
    public  Optional<Country> getCountry(int id){
        return countryService.findCountry(id);
    }


    @RequestMapping(value = "/Countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateCountry(Country country){
        countryService.save(country);
        return"redirect:/Countries";
    }

    @RequestMapping(value = "/Countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(int id){
        countryService.delete(id);

        return "redirect:/Countries";

    }

}
