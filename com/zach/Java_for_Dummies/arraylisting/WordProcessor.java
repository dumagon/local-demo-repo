
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;


public class WordProcessor{

public static void main(String[] args)throws IOException{

    if(args.length<2){
        System.out.println("arguement mismatch");
        System.exit(1);
    }

    // args[0] and args[1] are values from main(String []args) , that's how they were initilized 
    // from command line -  java WordProcessor Output.txt Lines.txt - args[0]=Output.txt args[1]=Lines.txt 
    PrintRequest printer =new PrintRequest(args[0],args[1]);

    boolean wantToContinue =true;
    Scanner scan =new Scanner(System.in);

   while(wantToContinue){


       printer.printLine();

        System.out.println("wanna continue writing? (y) ");

          String  yes_no = scan.next();

           if(yes_no.equals("y")){
               wantToContinue=true;
           }else{
               wantToContinue=false;
           }

        }

scan.close();
    
 }

}





class PrintRequest{


String pathToFileToBeWritten;
String pathToFileToBeRead;


public PrintRequest(String pathToFileToBeWritten,String pathToFileToBeRead){
    this.pathToFileToBeWritten=pathToFileToBeWritten;
    this.pathToFileToBeRead=pathToFileToBeRead;
}




public void printLine()throws IOException{

     String [] lines= new String[10] ;
     int linesIndex=0;
     Scanner stringScan = new Scanner(new File(pathToFileToBeRead));


     while(stringScan.hasNextLine() && linesIndex<lines.length){
       lines[linesIndex]=stringScan.nextLine();
       linesIndex++;
       }
     stringScan.close();

    System.out.println("what line to replace 0-9");

    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();


    System.out.println("type a new line ");

    keyboard=new Scanner(System.in);
    String data = keyboard.nextLine();
    lines[input]=data;

 

       PrintStream linePrinter =new PrintStream(pathToFileToBeWritten);

        for(int i=0;i<lines.length;i++){
           linePrinter.println(lines[i]);
        }

    linePrinter.close();
 
    System.out.println("done");


   }

}