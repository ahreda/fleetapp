package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Location;
import com.spring.fleetapp.repositories.LocationRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    LocationRepositories locationRepositories;

    public LocationService(LocationRepositories locationRepositories) {
        this.locationRepositories = locationRepositories;
    }

    public List<Location> getAllLocations(){

        return locationRepositories.findAll();
    }

    public void save(Location location) {

        locationRepositories.save(location);
    }

    public Optional<Location> findById(Integer id) {
        return locationRepositories.findById(id);

    }

    public  void  deleteLocationById(Integer id){
        locationRepositories.deleteById(id);
    }
}
