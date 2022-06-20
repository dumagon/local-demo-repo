import com.zach.Java_for_Dummies.enum_examples.Student;
import com.zach.Java_for_Dummies.enum_examples.Major;

public class StudentWithGrades extends Student{

    private double [] grades;
 



   public StudentWithGrades(String name,int ID,double [] grades){
       
     super(name,ID);
     this.grades=grades;
   } 

   public double calculateAverageGrade(){
       double averageGrade=0.0;
       grades=this.grades;
       for(double grade:grades){
         
       averageGrade+=grade;    
 
       }

       return averageGrade/grades.length;
   }

}