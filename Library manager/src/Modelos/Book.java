/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelos;

import java.util.ArrayList;
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
    private int publicationYear;
    private boolean isAvailable;

    public Book(String bookId, String title, Author author, String gender, int publicationYear) {
        this.bookId = bookId;
        this.title = title;
        this.author =  author;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
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
        return "Book{" + "bookId=" + bookId + ", title=" + title + ", author=" + author + ", gender=" + gender + ", publicationYear=" + publicationYear + ", isAvailable=" + isAvailable + '}';
    }
    
    
    
    
    
}
