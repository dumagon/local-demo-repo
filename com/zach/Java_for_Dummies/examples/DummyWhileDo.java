package com.zach.Java_for_Dummies.examples;

import java.util.Random;
import java.util.Scanner;
class DummyWhileDo{
    public static void main(String[] args){
        int guessCount=0;
        int random =new Random().nextInt(10)+1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please type a number ");

        int number=keyboard.nextInt();
        guessCount++;
        do{
            System.out.println("try again");
            number=keyboard.nextInt();
            guessCount++;

        }while(number!=random);
        System.out.println("right!");
        System.out.println(guessCount);
    }

}