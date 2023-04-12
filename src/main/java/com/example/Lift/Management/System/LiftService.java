package com.example.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiftService {

    @Autowired
    LiftRepository repository;

    public void addLift(Lift lift){

        repository.addLift(lift);
    }

    public void addPassenger(Passenger passenger){

        repository.addPassenger(passenger);
    }
}
