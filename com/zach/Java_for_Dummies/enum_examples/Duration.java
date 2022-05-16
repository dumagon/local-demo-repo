package com.zach.Java_for_Dummies.enum_examples;

import java.time.LocalTime;
import java.time.temporal.*;

public class Duration extends AirplaneFlights {


// displays duration of a given flight in hh:mm format

public void getDurationTime(LocalTime departureTime,LocalTime arrivalTime){

    

    long hours =ChronoUnit.HOURS.between(departureTime,arrivalTime);
    long minutes =ChronoUnit.MINUTES.between(departureTime,arrivalTime);
    long fullHoursInMinutes =60*hours;
    long minutesLeftAfterFullHours =minutes-fullHoursInMinutes;

    System.out.println(hours+":"+minutesLeftAfterFullHours);
}


}