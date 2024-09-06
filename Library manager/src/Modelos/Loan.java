/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.util.Date;

/**
 *
 * @author Lasval
 */
public class Loan {
    private String loanId;
    private Book book;
    private String userId;
    private Date loanDate;
    private Date expectedReturnDate;
    private boolean isReturned;

    public Loan(String loanId, Book book, String userId, Date loanDate, Date expectedReturnDate) {
        this.loanId = loanId;
        this.book = book;
        this.userId = userId;
        this.loanDate = loanDate;
        this.expectedReturnDate = expectedReturnDate;
        this.isReturned = false;
    }

    public Loan(String loanId, Book book, String userId) {
        this.loanId = loanId;
        this.book = book;
        this.userId = userId;
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

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
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
        return  "loan Id=" + loanId + ", book=" + book +  ", isReturned=" + isReturned ;
    }
    
    

    
    
    
}
