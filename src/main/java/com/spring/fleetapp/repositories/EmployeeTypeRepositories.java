package com.spring.fleetapp.repositories;

import com.spring.fleetapp.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeTypeRepositories extends JpaRepository<EmployeeType, Integer> {

    Optional<EmployeeType> findEmployeeTypeById(Integer id);

}
