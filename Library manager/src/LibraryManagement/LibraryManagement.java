/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LibraryManagement;

import Modelos.Author;
import Modelos.Book;
import Modelos.Library;
import java.util.ArrayList;

/**
 *
 * @author Lasval
 */
public class LibraryManagement {
    public static void main(String[] args){
        Library library = new Library(new ArrayList<>(),new ArrayList<>());
       
        System.out.println(library.registrerBook(new Book("0401","Calculo 1", new Author("09081536", "Jorge RR Martin") ,"Terror", 1980)));
        System.out.println(library.loanBook("04012473184", "Calculo 1", "21-7-2024", "23-7-2024"));
        //System.out.println(library.loanBook("04012473184", "Calculo 1", "21-7-2024", "23-7-2024"));
        System.out.println(library.returnBook("0401247318412", "23-7-2024"));
        System.out.println(library.returnBook("040124731841", "23-7-2024"));
        System.out.println(library.returnBook("040124731841", "23-7-2024"));
        //System.out.println(library);
        System.out.println(library.searchBooks("Cal"));
        System.out.println(library.searchBooks("col"));
    }
}
