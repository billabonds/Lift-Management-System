package com.example.Lift.Management.System;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class LiftRepository {

    HashMap<Integer,Lift> liftDb = new HashMap<>();

    HashMap<Integer,Passenger> passengerDb = new HashMap<>();

    // Question :
        //    Create a Lift management system:
        //    POST: Add Lift, Passenger
        //    Lift: LiftNo, CapacityInWeight, CapacityInPerson, List<Passenger>;
        //    Passenger: PassengerId, Lift, Weight

        //      Delete all passengers with id less than 5
        //      Find the maximum number of people with weight X that can travel in a lift,
        //      Given- (LiftId ,Weight)
        //      ex : lift - 50, person - 5kg , ans - 10
        //      Find the number of people with weight greater than 50 in a given lift, Given- (liftId)


    public void addLift(Lift lift){

        liftDb.put(lift.getLiftNo(),lift);
    }

    public void addPassenger(Passenger passenger){

        passengerDb.put(passenger.getPassengerId(),passenger);
    }

    public void deletePassengerIdLessThan5()
    {
        for(int passengerId : passengerDb.keySet())
        {
            if(passengerId < 5)
                passengerDb.remove(passengerId);
        }
    }

    public int Max(int LiftId,int Weight)
    {
        int count = 0;

        if (liftDb.containsKey(LiftId))
        {
            int temp = liftDb.get(liftDb).getCapacityInWeight();
            count = temp/Weight;
        }

        return count;
    }

    public int people(int liftId)
    {
        int count = 0;

        if(liftDb.containsKey(liftId))
        {
            List<Passenger> passengers = liftDb.get(liftId).getPassengerList();

            for(Passenger st : passengers)
            {
                if(st.getWeight() > 50)
                    count++;
            }
        }

        return count;
    }


}
