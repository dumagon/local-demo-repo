package com.zach.Java_for_Dummies.enum_examples;

public class Student{

int ID ;
double GPA;
Major major;
String name;


// for newcomers 😎
public Student(String name,int ID){
    this.name=name;
    this.ID=ID;
}

// on board students😊
public Student(String name ,int ID,double GPA,Major major){
    
    this.name=name;
    this.ID=ID;
    this.GPA=GPA;
    this.major=major;

}


public void displayStudentInfo(){
    
    System.out.println( "student-"+name+", ID- "+ID+ ", average point- "+GPA+", major- "+major);
}


}