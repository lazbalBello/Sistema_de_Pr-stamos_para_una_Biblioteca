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
public class Book {
    private String bookId;
    private String title;
    private Author author;
    private String gender;
    private Date publicationYear;
    private boolean isAvailable;

    public Book(String bookId, String title, Author author, String gender, Date publicationYear) {
        this.bookId = bookId;
        this.title = title;
        this.author =  author;
        this.gender = gender;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public Book(String bookId, String title, Author author, String gender) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.isAvailable = true;
    }

    public Book(String bookId, String title, String gender, Date publicationYear) {
        this.bookId = bookId;
        this.title = title;
        this.gender = gender;
        this.publicationYear = publicationYear;
         this.isAvailable = true;
    }

    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return  String.valueOf(title);
    }
    
    
    
    
    
}
