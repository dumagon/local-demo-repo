package com.zach.Java_for_Dummies.enum_examples;



public class StudentToString extends Student{

   public StudentToString(String name,int ID){
       super(name,ID);

   }
   public StudentToString(String name,int ID,double GPA,Major major){
       super(name,ID,GPA,major);
   }

   public String getStringOfInfo(){
       return "student "+name+", ID "+ID+" , GPA"+GPA+" ,major"+major;
   }


}