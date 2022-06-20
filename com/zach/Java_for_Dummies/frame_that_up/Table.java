import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;


public class Table implements Summarizable,Displayable,Deletable{
  
 Scanner discScanner;
 ArrayList<String> lines =new ArrayList<>();


 public Table(String pathToFile){
 
  try{
    discScanner =new Scanner(new File(pathToFile));
  } catch(FileNotFoundException e){
    e.printStackTrace();
  }

   while(discScanner.hasNextLine()){
    lines.add(discScanner.nextLine());
   }


 }

 @Override
 public void display(){
    for(String line : lines){
        if(line!=null)System.out.println(line);
    }
 }

 @Override
 public String summarize(){
    return lines.get(0);
 }

 @Override 
 public void delete(){
   

    String header = lines.get(0);
    lines.clear();
    lines.add(0,header);
 }



}