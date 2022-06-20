
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Scanner;


public class RoomChecker{

    
    public static void main(String[] args) throws IOException{
     
    
      DummiesFrame frameToFillRooms = new DummiesFrame("m tel");
           
             frameToFillRooms.addRow("how many people in the room 3");
             frameToFillRooms.go();
      }

   
   
   public static String calculate(int guestsNumberTyped) throws Exception{

         Scanner dickReader = new Scanner(new File("guests.txt"));

         int[] rooms = new int[10];

        for(int room =0;room<10;room++){
        
             rooms[room] = dickReader.nextInt();
        }
          dickReader.close();

          rooms[3]=guestsNumberTyped;



         PrintStream listOut = new PrintStream("guests.txt");
         for(int room=0; room<10;room++){
             listOut.print(rooms[room]);
             listOut.print(" ");
         }

         listOut.close();

       

        return "done";

   
      }

     


}