import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.File;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LineProcessor {
    public static void main(String[] args) throws IOException{

        Scanner keyboard = new Scanner(System.in);
        List<String> listOfStrings = new ArrayList<>();
        PrintStream printer = new PrintStream(new File("Lines.txt"));

        for(int i = 0; i<=21;i++){
            String temp = " '''"+i;
            listOfStrings.add(i,temp);}

       System.out.println("type in i,r,d");
       
       String command = keyboard.next();

       actOnCommand(command,listOfStrings);


       for(String line : listOfStrings){
           printer.println(line);
       }


       keyboard.close();
       printer.close();







    }

 
 public static void actOnCommand(String command,List<String> list){

      switch(command){

         case "i":

          if(list.size()>=21) list.add(21," two one ");
          break;

         case "r":

          if(list.size()>=13) {list.remove(13); list.add(13," one three ");}
          break;

        case "d":

          if(list.size()>=7) list.remove(7); 
          if(list.size()>7) {
              String temp = list.get(8);
              list.remove(8);
              list.add(7,temp);}
              break;

      default :

          System.out.println("incorrect command");
          
      }

 }

}