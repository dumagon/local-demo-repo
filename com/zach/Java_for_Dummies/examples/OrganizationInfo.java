package com.zach.Java_for_Dummies.examples;

public class OrganizationInfo {
    public static void main(String[] args){

  NonProfitOrganization saveWorld = new NonProfitOrganization();
  ProfitMakingOrganization nokia =new ProfitMakingOrganization();

  saveWorld.setName("Save The World ");
  saveWorld.setAnnualRevenue(350000);

  saveWorld.calcTax(saveWorld.getAnnualRevenue());

  nokia.setName("Nokia");
  nokia.setAnnualRevenue(45000000);

  nokia.calcTax(nokia.getAnnualRevenue());


    }
}