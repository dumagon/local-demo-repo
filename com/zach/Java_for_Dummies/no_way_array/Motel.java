
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Motel {

    public static void main(String[] args) throws IOException {
  
  Scanner diskReader = new Scanner(new File("guests.txt"));

  int rooms[] = new int[10];

  for(int room =0;room<10;room++){

      rooms[room]=diskReader.nextInt();

  }

  System.out.println("Room\tGuests");

    for(int room =0;room<10;room++){
       
       System.out.print(room);
       System.out.print("\t");
       System.out.println(rooms[room]);
    } 

    diskReader.close();

    }
}