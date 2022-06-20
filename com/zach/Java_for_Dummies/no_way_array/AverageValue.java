public class AverageValue{
    public static void main(String[] args){

double [] array = {23.4,23.56,21.45,22.65,25.3};

double result=0;

for(double temp:array){
    result+=temp;
}

System.out.println(result/array.length);

    }
}