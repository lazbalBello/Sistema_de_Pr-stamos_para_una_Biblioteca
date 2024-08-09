/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.util.List;

/**
 *
 * @author Lasval
 */
public class LibrarySystem {
    private List<Book> books;
    private List<Loan> loans;

    public LibrarySystem(List<Book> books, List<Loan> Loans) {
        this.books = books;
        this.loans = Loans;
    }
    
     
    
    public Result registrerBook(Book book)throws IllegalArgumentException{
        books.add(book);
        return new Result(true, "Book "+ book.getTitle() + " successfully registered");
    }
    
    public Result loanBook(String userId,String bookTitle , String loanDate, String expectedReturnDate){
        for(Book book: books)
            if(book.getTitle().equalsIgnoreCase(bookTitle))
                if(book.isIsAvailable()){
                   book.setIsAvailable(false);
                   loans.add(new Loan(userId+ 1,book,userId,loanDate,expectedReturnDate));
                   return new Result(true, "Book loaned successfully.");
            }else{
                 return new Result(false, "Book is not available. Book is already loaned out");
          }
        return new Result(false, "Book does not exist in the library");
    }
    
    public Result returnBook(String loanID, String returnDate){
       for(Loan loan: loans)
            if(loan.getLoanId().equals(loanID))
                if(!loan.isIsReturned()){
                   loan.setIsReturned(true);
                   loan.getBook().setIsAvailable(true);
                   return new Result(true, "Book returned successfully.");
            }else{
                return new Result(false, "Book is already returned.");
        }           
        return new Result(false, "Incorrect loan ID");
    }
    
    public Result searchBooks( String query){
        for(Book book: books)
            if(book.getTitle().contains(query))
                return new Result(true, "Book found."+ book.getTitle());
        return new Result(false, "No books found matching the query.");
        
    }

    @Override
    public String toString() {
        return "LibrarySystem{" + "books=" + books + ", loans=" + loans + '}';
    }

   
    
    
    
}
