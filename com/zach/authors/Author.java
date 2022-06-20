
package  com.zach.authors;

import com.zach.books.Book;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private List<Book> bibliography= new ArrayList<>();
    private String name;


    public Author(String name){
        this.name=name;
    }

    public void addBook(Book book){

        bibliography.add(book);

    }


    public List<Book> getBibliography(){

        return this.bibliography;
    }

    public String getName(){
        return this.name;
    }

}