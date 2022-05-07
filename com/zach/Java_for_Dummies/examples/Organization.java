package com.zach.Java_for_Dummies.examples;

public class Organization{
    private String name;
    private double annualRevenue;

    public void setName(String name){
        this.name=name;
    }
    public void setAnnualRevenue(double annualRevenue){
        this.annualRevenue=annualRevenue;
    }



    public String getName(){
        return this.name;
    }
    public double getAnnualRevenue(){
        return this.annualRevenue;
    }
}