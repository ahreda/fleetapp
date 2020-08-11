package com.spring.fleetapp.controllers;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.models.Location;
import com.spring.fleetapp.models.State;
import com.spring.fleetapp.services.CountryService;
import com.spring.fleetapp.services.LocationService;
import com.spring.fleetapp.services.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    LocationService locationService;
    CountryService countryService;
    StateService stateService;

    public LocationController(LocationService locationService, CountryService countryService, StateService stateService) {
        this.locationService = locationService;
        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping("/Locations")
    public String getLocations(Model model){

        List<Location> locations = locationService.getAllLocations();
        List<Country> countries = countryService.getCountries();
        List<State> states = stateService.getStates();
        model.addAttribute("locations", locations);
        model.addAttribute("states", states);
        model.addAttribute("countries", countries);
        return "location";
    }
    @PostMapping("Location/addNewLocation")
    public String addNewLocation( Location location){

        locationService.save(location);
        return "redirect:/Locations";
    }

   @GetMapping("/Locations/locationId")
    @ResponseBody
    public Optional<Location> getLocation(Integer id){

        return locationService.findById(id);
    }

    @RequestMapping(value = "/Locations/updateLocation" , method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateLocation(Location location){
        locationService.save(location);
        return "redirect:/Locations";
    }


    @RequestMapping(value = "Locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteLocation(int id){

        stateService.deleteLocationById(id);
        return "redirect:/Locations";
    }

}
