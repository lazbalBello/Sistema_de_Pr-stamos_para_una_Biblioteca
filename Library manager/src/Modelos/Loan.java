/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

/**
 *
 * @author Lasval
 */
public class Loan {
    private String loanId;
    private Book book;
    private String userId;
    private String loanDate;
    private String expectedReturnDate;
    private boolean isReturned;

    public Loan(String loanId, Book book, String userId, String loanDate, String expectedReturnDate) {
        this.loanId = loanId;
        this.book = book;
        this.userId = userId;
        this.loanDate = loanDate;
        this.expectedReturnDate = expectedReturnDate;
        this.isReturned = false;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(String expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public boolean isIsReturned() {
        return isReturned;
    }

    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanId=" + loanId + ", book=" + book + ", userId=" + userId + ", loanDate=" + loanDate + ", expectedReturnDate=" + expectedReturnDate + ", isReturned=" + isReturned + '}';
    }
    
    

    
    
    
}
