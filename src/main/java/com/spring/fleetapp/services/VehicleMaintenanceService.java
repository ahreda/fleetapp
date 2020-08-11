package com.spring.fleetapp.services;

import com.spring.fleetapp.models.VehicleMaintenance;
import com.spring.fleetapp.repositories.VehicleMaintenanceRepositories;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VehicleMaintenanceService {

VehicleMaintenanceRepositories vehicleMaintenanceRepositories;

    public VehicleMaintenanceService(VehicleMaintenanceRepositories vehicleMaintenanceRepositories) {
        this.vehicleMaintenanceRepositories = vehicleMaintenanceRepositories;
    }

    public List<VehicleMaintenance> getAllvehicleMaintenances(){

        return vehicleMaintenanceRepositories.findAll();

    }
}
