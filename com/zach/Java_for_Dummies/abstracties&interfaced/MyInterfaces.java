 public class MyInterfaces{

public static void main(String[] args){

 double[]  numbers = {39.5,47.3,12.5,78.4};

 ColumnOfNumbers column = new ColumnOfNumbers(numbers);

 displayMe(column);
 summarizeMe(column);
 deleteMe(column);
 


 Table myTable = new Table("Table.txt");
 
 displayMe(myTable);
 summarizeMe(myTable);
 deleteMe(myTable);
 

}

static void displayMe(Displayable displayable){
    displayable.display();
}

static void summarizeMe(Summarizable summarizable){

    System.out.println(summarizable.summarize());
}

static void deleteMe(Deletable deletable){
    deletable.delete();
}

 } 