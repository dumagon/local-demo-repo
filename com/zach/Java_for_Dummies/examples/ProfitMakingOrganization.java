package com.zach.Java_for_Dummies.examples;

public class ProfitMakingOrganization extends Organization{
    public void calcTax(double income){
        System.out.printf("annual tax for '%s' as a profit maker - $%,10.4f (%s) with annual income ($%,10.4f)\n"
        ,getName(),income/100*10,"10%",getAnnualRevenue());
    }
}