package com.spring.fleetapp.repositories;

import com.spring.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepositories extends JpaRepository<Client, Integer> {

}
