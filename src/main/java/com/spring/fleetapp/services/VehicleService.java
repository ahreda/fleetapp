package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Vehicle;
import com.spring.fleetapp.repositories.VehicleRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    VehicleRepositories vehicleRepositories;

    public VehicleService(VehicleRepositories vehicleRepositories) {
        this.vehicleRepositories = vehicleRepositories;
    }

    public List<Vehicle> getAllVehicles(){
        return vehicleRepositories.findAll();
    }
}
