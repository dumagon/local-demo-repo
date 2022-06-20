
import java.util.Scanner;



public class DummieException{


    public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

     String[] array = new String[5];
    
    try{

            int i =0;  
            do{
                 array[i]=keyboard.next();
                

            }while(!array[i++].equals("quit"));
    
    }catch(Exception e){

        System.out.println("the storage is full");
    }

    keyboard.close();

    for(String word:array){

        System.out.println(word);
    }


    }
}

