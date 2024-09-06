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
import Modelos.Loan;
import Modelos.Result;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import static org.junit.Assert.*;
/**
 *
 * @author Lasval
 */
public class LibraryManagementTest {
    
    private Library library;   
    private Book book;
    private Author author;
    private Loan loan;
    @Before
    public void supertest(){
    library = new Library(new ArrayList<>(), new ArrayList<>());
    author = new Author("32141", "StephenKing");
    book = new Book("3242423", "It", author, "Horror");
    loan = new Loan("0401", book, "040124");
   
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
        assertEquals("Book " + book.getTitle() + " is already exists in the library", result.getMessage());
        
    }
    
    @Test
    public void loanBook(){
        library.registrerBook(book);
        Result result = library.loanBook(loan);
        assertTrue(result.isSuccess());
        assertEquals("Book loaned successfully. Your loan id is " + loan.getLoanId(), result.getMessage());
    }
    
    /**
     *
     */
    @Test
    public void searchBook(){
        Book book1 = new Book("3242423", "et", author, "Horror");
        Book book2 = new Book("3242423", "ot", author, "Horror");
        library.registrerBook(book);
        library.registrerBook(book1);
        library.registrerBook(book2);
        DefaultListModel<Book> results = library.searchBooks("It");
        assertEquals(1, results.size());
       
    }
}
