
import java.util.Scanner;

import java.io.File;
import java.io.IOException;






public class MotelInfo{
    public static void main(String[] args) throws IOException{



  DummiesFrame frame = new DummiesFrame("Tundra Motel");

  frame.addRow("Room (0-9)");
  frame.go();

    }

    public static String calculate(int roomTyped)throws IOException{

       Scanner diskReader = new Scanner(new File("guests.txt"));

  int rooms[] = new int[10];

  for(int room =0;room<10;room++){

      rooms[room]=diskReader.nextInt();

  }
  if(rooms[roomTyped]==1) return 1+" tenant";
  return rooms[roomTyped]+" tenants";
    }

}