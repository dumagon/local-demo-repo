
import com.zach.books.Book;
import com.zach.authors.Author;
import java.util.List;

public class AuthorsAndBooks{

 public static void main(String[] args){

 Author author1 = new Author("Stephen King");
 author1.addBook(new Book("Shining"));
 author1.addBook(new Book("the Institute"));

 System.out.println(author1.getName());

 List<Book> books = author1.getBibliography();

 for(Book book:books){
     System.out.println(book.getName()); 
 }

 }


}