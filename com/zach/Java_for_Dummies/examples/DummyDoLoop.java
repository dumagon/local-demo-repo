package com.zach.Java_for_Dummies.examples;


import java.util.Scanner;
class DummyDoLoop{
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    char input;
    do{
       System.out.println("red pill or blue pill? (r/b)?"); 
        input=keyboard.findWithinHorizon(".",0).charAt(0);

    }while(input!='r' && input!='b');
        if(input=='r'){
            System.out.println("u r screwed buddy");
            
        }else{System.out.println(" well u r screwed either sorry");}
     System.out.println("PS.there's no free will anyway");
}

}