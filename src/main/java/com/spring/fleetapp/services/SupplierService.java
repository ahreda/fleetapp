package com.spring.fleetapp.services;

import com.spring.fleetapp.models.Supplier;
import com.spring.fleetapp.repositories.SupplierRepositories;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;


@Service
public class SupplierService {

SupplierRepositories supplierRepositories;

    public SupplierService(SupplierRepositories supplierRepositories) {
        this.supplierRepositories = supplierRepositories;
    }

    public List<Supplier>getAllSuppliers(){
      return  supplierRepositories.findAll();

    }

    public void save(Supplier supplier){

        supplierRepositories.save(supplier);
    }
}
