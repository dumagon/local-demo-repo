 
package com.zach.Java_for_Dummies.examples;

public class PlaceToLive{
    private String address;
    private int numOfBedrooms;
    private double squareMeters; // in square meters 


public void setAddress(String address){
    this.address =address;
}

public void setNumberOfBedrooms(int numOfBedrooms){
    this.numOfBedrooms=numOfBedrooms;
}
public void setSquareMeters(double squareMeter){
    this.squareMeters=squareMeter;
}

public int getNumberOfBedrooms(){
    return this.numOfBedrooms;
}

public double getSquareMeters(){
    return this.squareMeters;
}



   
   public double calcPricePerMeter(double  costPerMeter ){

       

     if( squareMeters<=0) {
         System.out.println("you typed a negative number or zero"); return -1;
     }else{

        return costPerMeter*squareMeters;

        
   }
   }

   public float calcPricePerBedroom(int numOfBedrooms,float priceForBedroom){
          return priceForBedroom*numOfBedrooms;
   }
    
}