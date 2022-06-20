

import java.util.ArrayList;
import java.text.NumberFormat;


public class LambdaTest{

    public static void main(String[] args){

    ArrayList<Employee> employee= new ArrayList<>();

    employee.add(new Employee("Barry",2));
    employee.add(new Employee("Burd",3));
    employee.add(new Employee("Tom",2));
    employee.add(new Employee("Curt",5));

  NumberFormat currency = NumberFormat.getCurrencyInstance();

  double totalBonus = employee.stream().filter((hirie)->hirie.getScore()>=3).map((hirie)->100.0).reduce(0.0,(Double::sum));
  System.out.println(currency.format(totalBonus));

  
  

    }

    static class Employee {

    String name ;
    private int score;

    public Employee(String name,int score){
        this.name=name;
        this.score=score;
    }

    public int getScore(){
        return this.score;
    }

    }

}