import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class ExceptionalAcknowelgement {

public static void main(String[] args) throws FileNotFoundException,IndexOutOfBoundsException,ArithmeticException {

Scanner  diskScanner = new Scanner(new File("numbers.txt"));

int[] numerators = new int[5]; 
int[] denominators = new int[5];

int i = 0;

try{

     diskScanner = new Scanner(new File("numbers.txt"));

while (diskScanner.hasNextInt()) {

     numerators[i] = diskScanner.nextInt(); denominators[i] = 
     diskScanner.nextInt(); i++;

}

}catch(FileNotFoundException e){

    System.out.println("Big Sorry ! We failed to find the source ");

}catch(Exception e){

    System.out.println("Ooops, we're not sure but it must be OutOfBoundException ");
    e.printStackTrace();
}



try{

for (int j = 0; j < numerators.length; j++) {
     System.out.println(numerators[j] / denominators[j]);
}
}catch(Exception e){
    System.out.println("We're really sorry u may be trying to divide by zero");
    e.printStackTrace();
}


diskScanner.close();
}

}
