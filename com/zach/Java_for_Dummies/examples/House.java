
package com.zach.Java_for_Dummies.examples;



public class House extends PlaceToLive{


private double propertyTax; // annually

public void setPropertyTax(double annualTax){
    this.propertyTax=annualTax;
}

public double calcTotalMonthlyCostPerBedroom(int numOfBedrooms,double propertyTax,double costPerBedroom){

return costPerBedroom*numOfBedrooms+propertyTax/12;
   }

public double caclTotalMonthlyCostPerSquareMeters(double squareMeters,double propertyTax, double costPerSquareMeter){

return costPerSquareMeter*squareMeters+propertyTax/12;
}

}