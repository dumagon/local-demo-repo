
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FixedWithTryCatch{

public static void main(String[] args) throws IOException,FileNotFoundException,EOFException {


File inputFile= new File("input.txt");
FileInputStream reader = new FileInputStream(inputFile);

File outputFile = new File("output.txt");
FileOutputStream writer = new FileOutputStream(outputFile);


// try with sources  try (sources) { }catch{} , streams will be closed automatically if an exception is thrown

try(DataInputStream dataReader = new DataInputStream(reader);
         DataOutputStream dataWriter = new DataOutputStream(writer)){


             while(true){    dataWriter.writeByte(dataReader.readByte());  }


}catch(EOFException e){

       System.out.println(" the source file has no more data to read");
       e.printStackTrace();

}catch(FileNotFoundException f){

    System.out.println("the specified source file does not exist");
    
}catch(IOException o){
    System.out.println("some other ioexception ");
    o.printStackTrace();


}


System.out.println("well done try !");







// File inputFile= new File("input.txt");
// FileInputStream reader = new FileInputStream(inputFile);
// DataInputStream dataReader = new DataInputStream(reader);


// File outputFile = new File("output.txt");
// FileOutputStream writer = new FileOutputStream(outputFile);
// DataOutputStream dataWriter = new DataOutputStream(writer);




// try{

// while(true){    dataWriter.writeByte(dataReader.readByte());  }


// }catch(EOFException e){

//        System.out.println(" the source file has no more data to read");
//        e.printStackTrace();

//       }
  
//   catch(FileNotFoundException f){

//     System.out.println("the specified source file does not exist");
    
// }catch(IOException o){
//     System.out.println("some other ioexception ");
//     o.printStackTrace();


// }finally{

// dataReader.close();
// dataWriter.close();

// System.out.println("finally got it down cold");



// }



}







}