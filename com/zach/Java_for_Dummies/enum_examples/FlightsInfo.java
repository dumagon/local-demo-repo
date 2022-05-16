package com.zach.Java_for_Dummies.enum_examples;

import java.time.LocalTime;

public class FlightsInfo{
    public static void main(String[] args){

LocalTime departureTime =  LocalTime.of(9,33);
LocalTime arrivalTime = LocalTime.of(12,47);

AirplaneFlights toUSA =new AirplaneFlights(787,departureTime,arrivalTime,Airports.SVO,Airports.JFK);
toUSA.displayFlightInfo();

AirplaneFlights toGhana = new AirplaneFlights(231,Airports.JFK,Airports.ACC);
toGhana.displayFlightInfo();


Duration durationOfFlight = new Duration();
durationOfFlight.getDurationTime(departureTime,arrivalTime);

    }
}