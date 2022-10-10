/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;


import entity.Author;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {
    Scanner scanner = new Scanner(System.in);
    
            
            
    public Book createBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite nazvanie; ");
        book.setTitle(scanner.nextLine());
        System.out.println("vvedite 4islo avtorov");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthors(countAuthorsInBook));
        return book;
    }
    
    private Author[] createAuthors(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for(int i=0; i< countAuthorsInBook;i++){
            Author author= new Author();
            System.out.println("AUTHOR NAME"+(i+1)+": ");
            author.setFirstname(scanner.nextLine());
            System.out.print("familia autora"+(i+1)+": ");
            author.setLastname(scanner.nextLine());
            authors[i]=author;
            
                    
        }
        return authors;
    }
}

   

