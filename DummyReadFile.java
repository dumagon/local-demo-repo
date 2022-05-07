
import java.io.File;


public class DummyReadFile{
    public static void main(String[] args)throws Exception{

   File fileName =new File("EmployeeInfo.txt");
   System.out.println("look for "+fileName.getCanonicalPath());

    }
}