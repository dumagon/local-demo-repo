
import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;

class DummyTest{

public static void main(String[] args) {

Scanner keyboard =new Scanner(System.in);






out.println("Hi,I'm Numberzilla and I love tasty numbers! Please give me some that is more than 0 ,thank u :)) ");
out.println(" btw, I can't stand cold numbers <1 ");


try{

int userNum =keyboard.nextInt();
int maxNum=userNum;
while(userNum>0){

out.println("ohh, I like it! Feed me more numbers");

userNum=keyboard.nextInt();

if(maxNum<userNum) maxNum=userNum;

}


out.println("it's too cold for me to digest");

if(maxNum>0) out.println("but the tastier was "+maxNum);


}catch(Exception e ){

    out.println("noo,it's not edible ! numbers only :( ");
}

}



}