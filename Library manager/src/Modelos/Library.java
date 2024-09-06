/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Lasval
 */
public class Library {
    private List<Book> books;     
    private List<Loan> loans;
    private String nombre;
    
    public Library(List<Book> books, List<Loan> loans){
        this.books = books;
        this.loans = loans;
        
    }

    public Library() {
    }

    
    
    
    
    
    public Result registrerBook(Book book){
        for(Book b: books)
            if(b.getTitle().equalsIgnoreCase(book.getTitle()))
                return new Result(false, "Book " + book.getTitle() + " is already exists in the library");
        books.add(book);
        return new Result(true, "Book "+ book.getTitle() + " successfully registered");
    }
    
    public Result loanBook(Loan loan){
      loans.add(loan);
      loan.getBook().setIsAvailable(false);
      return new Result(true, "Book loaned successfully. Your loan id is " + loan.getLoanId());
         
    }
    
    public Result returnBook(Book book){
       for(Loan loan: loans)
            if(loan.getBook().equals(book) && !loan.isIsReturned()){
              loan.setIsReturned(true);
              loan.getBook().setIsAvailable(true);
              return new Result(true , "Book returned successfully");
            }
        return new Result(true, "The book already been returned");
    }
    
    public DefaultListModel<Book> searchBooks( String query){
        DefaultListModel<Book> results = new DefaultListModel<>();
        for(Book book: books)
            if(book.getTitle().contains(query))
                results.addElement(book);
        return results;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
    
    
   
    @Override
    public String toString() {
        return "LibrarySystem{" + "books=" + books + ", loans=" + loans + '}';
    }
   
}
