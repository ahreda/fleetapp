package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Country;
import com.spring.fleetapp.repositories.CountryRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional findCountry(Integer id){

        return countryRepositories.findById(id);


    }


    public void delete(int id){
        countryRepositories.deleteById(id);

    }

}
