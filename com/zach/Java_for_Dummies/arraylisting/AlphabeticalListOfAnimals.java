import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class AlphabeticalListOfAnimals {


public static void main(String[] args){

    List<String> listOfAnimals =new ArrayList<>();


      

    boolean wantToContinue=true;
    Scanner keyboard = new Scanner(System.in);



    while(wantToContinue){

        int entryCount = 0;

        System.out.println("type a name of an animal");

    String animalEntry = keyboard.next(); 

         if(listOfAnimals.size()==0){
      
            listOfAnimals.add(animalEntry);
            entryCount++;

        }else{

               for(int i = 0; i<listOfAnimals.size();i++){

               String toCompare = listOfAnimals.get(i);

               int result =toCompare.compareToIgnoreCase(animalEntry);

               if(result>0) {
                   listOfAnimals.add(i,animalEntry);
                   entryCount++;
                   break;
               }
            
            }
            if(entryCount==0) listOfAnimals.add(animalEntry);
        } 

       

        
           System.out.println(" wanna continue ? y/n");

         String userAnswer = keyboard.next();

             if(userAnswer.equals("n")) wantToContinue=false;
             if(userAnswer.equals("y")) continue;

             System.out.println(" unrecongnizable symbol ");
             wantToContinue=false;
             

          }

     
             for(String animal:listOfAnimals){
               System.out.println(animal);}

     

    }


    

    }
    

  






