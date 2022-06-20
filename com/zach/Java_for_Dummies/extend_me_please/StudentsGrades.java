public class StudentsGrades{

    public static void main(String[] args){

  double [] gradesOfJack={3.4,4.0,3.6,4.0,3.2};
  StudentWithGrades student =new StudentWithGrades("Jack",3445565,gradesOfJack);
  System.out.println(student.calculateAverageGrade());


    }
}