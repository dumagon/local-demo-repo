
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BiggestNumFinder {

public static void main(String[] args){
 
 Integer max = 0;

 List<Integer> numbers = new ArrayList<>();

 numbers.add(34);
 numbers.add(208);
 numbers.add(3);
 numbers.add(78);

 Iterator<Integer> iter = numbers.iterator(); 

 while(iter.hasNext()){
     Integer temp = iter.next();
     if(temp>max) max=temp;
 }

 System.out.println(max);

}
}