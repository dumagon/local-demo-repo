
package com.zach.Java_for_Dummies.examples;


public class Apartment extends PlaceToLive{

    

public double calcMonthlyRentPerBedroom(double numOfBedrooms, double costPerBedroom){
    return numOfBedrooms*costPerBedroom;
}

public double calcMonthlyRentPerSquareMeter(double squareMeters, double costPerSquareMeter){
    return squareMeters*costPerSquareMeter;
}

    
}