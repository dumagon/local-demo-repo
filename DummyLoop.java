

import static java.lang.System.*;
import java.util.Scanner;

class DummyLoop{
public static void main(String[] args){
Scanner keyboard =new Scanner(System.in);
while(true){
 out.println("Please, type in a number");
 int number=keyboard.nextInt();
 if(number>0 && number<10){continue;
 }
 if(number==0){  break;}
  out.println("entered "+number);


} out.println("done");

}
}