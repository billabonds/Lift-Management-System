package com.example.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiftController {

    @Autowired
    LiftService service;


        //    Create a Lift management system:
        //    POST: Add Lift, Passenger
        //    Lift: LiftNo, CapacityInWeight, CapacityInPerson, List<Passenger>;
        //    Passenger: PassengerId, Lift, Weight

    @PostMapping("/add-Lift")
    public String  addLift(@RequestBody Lift lift){

        service.addLift(lift);
        return "Lift added Successfully";
    }

    @PostMapping("/add-Passenger")
    public String addPassenger(@RequestBody Passenger passenger){

        service.addPassenger(passenger);
        return "Passenger added Successfully";
    }


}
