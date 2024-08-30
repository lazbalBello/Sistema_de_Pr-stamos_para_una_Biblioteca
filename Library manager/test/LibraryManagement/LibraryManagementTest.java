/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LibraryManagement;


import Modelos.Author;
import Modelos.Book;
import org.junit.Test;
import org.junit.Before;
import Modelos.Library;
import Modelos.Result;
import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 *
 * @author Lasval
 */
public class LibraryManagementTest {
    
    private Library library;   
    private Book book;
    private Author author;
    @Before
    public void supertest(){
    library = new Library(new ArrayList<>(), new ArrayList<>());
    author = new Author("32141", "StephenKing");
    book = new Book("3242423", "It", author, "Horror", 1978);
    }
        
    @Test
    public void SearchBookFound(){
        library.registrerBook(book);
        Result result = library.searchBooks("I");
        assertTrue(result.isSuccess());
        assertEquals("Book found."+ book.getTitle(), result.getMessage());
    }
    
    @Test
    public void SearchBookNotFound(){
       Result result = library.searchBooks("I");
        assertFalse(result.isSuccess());
        assertEquals("No books found matching the query.", result.getMessage());
    }
   @Test
    public void registrerBook(){
        Result result =  library.registrerBook(book);
        assertTrue(result.isSuccess());
        assertEquals("Book "+ book.getTitle() + " successfully registered",result.getMessage());
      }
    
    @Test
    public void registrerBookDuplicate(){
        library.registrerBook(book);
        Result result = library.registrerBook(book);
        assertFalse(result.isSuccess());
        
    }
}
