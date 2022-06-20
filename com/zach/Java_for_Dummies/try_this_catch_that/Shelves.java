import java.util.Scanner;
import java.io.IOException;
import java.text.NumberFormat;

public class Shelves{


public static void main(String[]args)throws IOException { 


int max_boxes ;
double priceForBox;


Scanner keyboard = new Scanner(System.in);
NumberFormat currency = NumberFormat.getCurrencyInstance();





try{

System.out.println("maximum number of boxes possible? "); 

int newMax = Integer.parseInt(keyboard
.next());

if(newMax<1) throw new Exception("max number can't be less than 1"); 

if(newMax>1000) throw new Exception("we don't have space to accomodate more than 1000 items");

max_boxes=newMax;




System.out.println("how much for each?");

double priceByUser =
Double.parseDouble(keyboard.next());

if(priceByUser<=0.0)throw new Exception("it can't be for free!");

priceForBox=priceByUser; 


System.out.println("how many boxes do we have?");

int numberOfBoxes= Integer.parseInt(keyboard.next());


if(numberOfBoxes<0)throw 
 new Exception("we can't have - number of real things");

if(numberOfBoxes>max_boxes)
throw new Exception("it's too many boxes"); 

System.out.println(currency.format(numberOfBoxes*priceForBox)+" for all boxes");


}catch(Exception e){

  System.out.println(e.getMessage());

}

keyboard.close();

  }

}