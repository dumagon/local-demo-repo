
package com.zach.Java_for_Dummies.enum_examples;

public class StudentsIn{

    public static void main(String[] args){

  Student Tony = new Student("Tony Jinx",748793);
  Student Mark = new Student("Mark Lansky",488838,4.0,Major.COMPUTER_SCIENCE);
  StudentToString TonyAsString =new StudentToString("Tony Jinx",748793);
  StudentToString MarkAsString =new StudentToString("Mark Lansky",488838,4.0,Major.COMPUTER_SCIENCE);

  String[] students =new String[10];
 
 students[0]=TonyAsString.getStringOfInfo();
 students[1]=MarkAsString.getStringOfInfo();

 for(String info : students){
   if(info!=null)System.out.println(info);

 }

  Tony.displayStudentInfo();
  Mark.displayStudentInfo();


    }
}