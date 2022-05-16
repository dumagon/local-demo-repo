package com.zach.Java_for_Dummies.examples;

public class ApartmentWithFee extends Apartment{

private double quarterFee;

@Override
public double calcMonthlyRentPerBedroom(double numOfBedrooms, double costPerBedroom){
    return (numOfBedrooms*costPerBedroom)+((getQuarterFee()*4)/12);
 
}

@Override
public double calcMonthlyRentPerSquareMeter(double squareMeters, double costPerSquareMeter){
    return squareMeters*costPerSquareMeter+(getQuarterFee()*4/12);
}

public void setQuarterFee(double quarterFee){
    this.quarterFee=quarterFee;
}

public double getQuarterFee(){
    return this.quarterFee;
}

}