package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.models.State;
import com.spring.fleetapp.services.CountryService;
import com.spring.fleetapp.services.StateService;
import lombok.Value;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    StateService stateService;
    Country country;
    CountryService countryService;

    public StateController(StateService stateService, CountryService countryService) {
        this.stateService = stateService;
        this.countryService= countryService;
    }


    @GetMapping("/States")
    public String getStates(Model model){

        List<State> states = stateService.getStates();
        List<Country> countries = countryService.getCountries();
        model.addAttribute("states", states);
        model.addAttribute("countries", countries);

        return"state";
    }

    @PostMapping("/States/addNewState")
    public String addNewState(State state){

        stateService.save(state);
        return"redirect:/States";
    }

    @GetMapping("/States/stateId")
    @ResponseBody
    public Optional<State> getState(int id){

        Optional<State> newState =  stateService.findStateById(id);
        return newState;

    }

    @RequestMapping(value = "State/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(State state){

        stateService.save(state);
        return "redirect:/States";

    }

    @RequestMapping(value = "/States/deleteId", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(int id){

        stateService.deleteStateById(id);
        return "redirect:/States";
    }

}
