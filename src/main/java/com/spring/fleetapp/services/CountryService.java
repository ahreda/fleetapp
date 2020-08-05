package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.repositories.CountryRepositories;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    CountryRepositories countryRepositories;

    public CountryService(CountryRepositories countryRepositories) {
        this.countryRepositories = countryRepositories;
    }

    public List<Country> getCountries(){

       return countryRepositories.findAll();

    }

    public void save(Country country){
        countryRepositories.save(country);
    }

}
