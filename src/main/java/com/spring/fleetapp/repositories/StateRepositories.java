package com.spring.fleetapp.repositories;

import com.spring.fleetapp.models.Client;
import com.spring.fleetapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepositories extends JpaRepository<State, Integer> {


}
