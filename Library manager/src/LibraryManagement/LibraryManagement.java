/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LibraryManagement;

import Modelos.Author;
import Modelos.Book;
import Modelos.Library;
import Modelos.Loan;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Lasval
 */
public class LibraryManagement {
    public static void main(String[] args){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = "2024/08/29";
        //Date date = dateFormat.parse(dateString);
         
        
        Library library = new Library(new ArrayList<>(),new ArrayList<>());
       
        //System.out.println(library.registrerBook(new Book("0401","Calculo 1", new Author("09081536", "Jorge RR Martin") ,"Terror", date)));
        //System.out.println(library.registrerBook(new Book("0401","Calculo 1", new Author("09081536", "Jorge RR Martin") ,"Terror", )));
        System.out.println(library.loanBook(new Loan("", null, dateString)));
        //System.out.println(library.loanBook("04012473184", "Calculo 1"));
        //System.out.println(library.returnBook("0401247318412", "23-7-2024"));
       // System.out.println(library.returnBook("040124731841", "23-7-2024"));
       // System.out.println(library.returnBook("040124731841", "23-7-2024"));
        //System.out.println(library);
        System.out.println(library.searchBooks("Cal"));
        System.out.println(library.searchBooks("col"));
        System.out.println(library);
    }
}
