
     
package com.zach.Java_for_Dummies.examples;



import java.io.File;

public class DisplayPlaceToLive{
    public static void main(String[] args)throws Exception{

      

    Apartment apartment =new Apartment();
    House house = new House();
    ApartmentWithFee apartmentWithFee=new ApartmentWithFee();

    apartmentWithFee.setQuarterFee(2000);
    apartmentWithFee.setNumberOfBedrooms(4);
    apartmentWithFee.setSquareMeters(45.3D);

    System.out.println(apartmentWithFee.calcMonthlyRentPerBedroom(apartmentWithFee.getNumberOfBedrooms(),10000));
    System.out.println(apartmentWithFee.calcMonthlyRentPerSquareMeter(apartmentWithFee.getSquareMeters(),1000));

    apartment.setNumberOfBedrooms(4);
    apartment.setSquareMeters(45.3D);

    System.out.println(apartment.calcMonthlyRentPerBedroom(apartment.getNumberOfBedrooms(),10000));
    System.out.println(apartment.calcMonthlyRentPerSquareMeter(apartment.getSquareMeters(),1000));
 
    house.setNumberOfBedrooms(5);
    house.setSquareMeters(200);

    System.out.printf("$%10.4f \n",house.caclTotalMonthlyCostPerSquareMeters(house.getSquareMeters(),1000,100));
    System.out.printf("$%10.4f \n",house.calcTotalMonthlyCostPerBedroom(house.getNumberOfBedrooms(),1000,5000));
       





    }
}