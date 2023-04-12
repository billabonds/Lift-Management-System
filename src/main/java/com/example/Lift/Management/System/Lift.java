package com.example.Lift.Management.System;

import java.util.List;

public class Lift {
            //    LiftNo, CapacityInWeight, CapacityInPerson, List<Passenger>;

    private int LiftNo;
    private int CapacityInWeight;
    private int CapacityInPerson;
    private List<Passenger> passengerList;

    public Lift() {
    }

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, List<Passenger> passengerList) {
        LiftNo = liftNo;
        CapacityInWeight = capacityInWeight;
        CapacityInPerson = capacityInPerson;
        this.passengerList = passengerList;
    }

    public int getLiftNo() {
        return LiftNo;
    }

    public void setLiftNo(int liftNo) {
        LiftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return CapacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        CapacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return CapacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        CapacityInPerson = capacityInPerson;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
