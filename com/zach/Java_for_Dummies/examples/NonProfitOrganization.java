package com.zach.Java_for_Dummies.examples;


public class NonProfitOrganization extends Organization{

 public void calcTax(double income){
     System.out.printf(" annual tax for ' %s ' as a non profit company - $%,10.4f (%s) with annual income ($%,10.4f) \n"
     ,getName(),income/100*2,"2%",getAnnualRevenue());
 }

}