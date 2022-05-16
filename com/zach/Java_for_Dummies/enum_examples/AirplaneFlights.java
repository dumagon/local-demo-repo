  
  package com.zach.Java_for_Dummies.enum_examples;
  
  import java.time.LocalTime;

  public class AirplaneFlights{
  
   int flightNumber;
   LocalTime departureTime;
   LocalTime arrivalTime;
   Airports airportOfDeparture;
   Airports airportOfArrival;


  public AirplaneFlights(){}

 // full info flights
  public AirplaneFlights(int flightNumber,LocalTime arrivalTime,LocalTime departureTime,Airports airportOfDeparture,
  Airports airportOfArrival){

      this.flightNumber=flightNumber;
      this.arrivalTime=arrivalTime;
      this.departureTime=departureTime;
      this.airportOfDeparture=airportOfDeparture;
      this.airportOfArrival=airportOfArrival;
  }

 
// no time info flights
 public AirplaneFlights(int flightNumber,Airports airportOfDeparture,Airports airportOfArrival){
     this.flightNumber=flightNumber;
     this.airportOfDeparture=airportOfDeparture;
     this.airportOfArrival=airportOfArrival;
 }

 public void displayFlightInfo(){
     if(departureTime!=null && arrivalTime!=null){ 
     System.out.println("flight "+flightNumber+", departure info - "
     +airportOfDeparture+" | "+departureTime+", arrival info - "+airportOfArrival+" | "+arrivalTime);
     }else{
        System.out.println("flight "+flightNumber+", departure info - "
     +airportOfDeparture+", arrival info - "+airportOfArrival); 
     }

 }

}