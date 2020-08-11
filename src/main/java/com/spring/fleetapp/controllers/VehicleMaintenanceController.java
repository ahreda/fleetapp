package com.spring.fleetapp.controllers;

import com.spring.fleetapp.services.SupplierService;
import com.spring.fleetapp.services.VehicleMaintenanceService;
import com.spring.fleetapp.services.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {

    VehicleMaintenanceService vehicleMaintenanceService;
    SupplierService supplierService;
    VehicleService vehicleService;

    public VehicleMaintenanceController(VehicleMaintenanceService vehicleMaintenanceService, SupplierService supplierService, VehicleService vehicleService) {
        this.vehicleMaintenanceService = vehicleMaintenanceService;
        this.supplierService = supplierService;
        this.vehicleService = vehicleService;
    }


    @GetMapping("/Maintenence")
    public String getVehicleMaintainancw(Model model){
        model.addAttribute("vehicleMaintenances", vehicleMaintenanceService.getAllvehicleMaintenances());
        model.addAttribute("suppliers", supplierService.getAllSuppliers());
        model.addAttribute("vehicles", vehicleService.getAllVehicles());

        return "vehicleMaintanance";
    }

}
