public class ColumnOfNumbers implements Summarizable,Deletable,Displayable{
    double [] numbers;

    public ColumnOfNumbers(double [] numbers){
    
    this.numbers=numbers;

    }

    @Override 
    public String summarize(){
        double total = 0.0;
        for(double number : numbers){
            total+=number;
        }
       return Double.toString(total);
    }
    @Override
    public void display(){
     for(double number : numbers){

        System.out.println(Double.toString(number));
     }     
    }

    @Override
    public void delete(){
        for(int i=0;i<numbers.length;i++){
            numbers[i]=0.0;
        }
    }
}