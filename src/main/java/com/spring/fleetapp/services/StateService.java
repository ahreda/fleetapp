package com.spring.fleetapp.services;

import com.spring.fleetapp.models.State;
import com.spring.fleetapp.repositories.StateRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    StateRepositories stateRepositories;

    public StateService(StateRepositories stateRepositories) {
        this.stateRepositories = stateRepositories;
    }

    public List<State> getStates (){

        return stateRepositories.findAll();
    }

    public void save(State state){
        stateRepositories.save(state);

    }

    public Optional<State> findStateById(Integer id){
        return stateRepositories.findById(id);
    }

    public void deleteStateById(Integer id){
        stateRepositories.deleteById(id);
    }

    public void deleteLocationById(int id) {
        stateRepositories.deleteById(id);
    }
}

