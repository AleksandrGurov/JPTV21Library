/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import entity.Author;
import entity.Book;
import java.util.Arrays;
import java.util.Scanner;
import managers.BookManager;

/**
 *
 * @author pupil
 */
public class App {
    private Book[] books;
    
    public App(){
        this.books=new Book[0];
    }
    public void run(){
        boolean repeat= true;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("spisok");
            System.out.println("0 zakrit");
            System.out.println("1 dobavit knigu");
            System.out.println("2 dobavit 4itatelya");
            System.out.println("3 vidat knigu");
            System.out.println("4 vernut knigu");
            System.out.println("5 spisok knig");

            
            System.out.print("choose zada4a:");
            int task= scanner.nextInt();
            scanner.nextLine();
            
            switch (task) {
                case 0: 
                    repeat=false;
                    break;
                case 1:
                    System.out.println("1 dobavit knigu");
                    BookManager bookManager = new BookManager();
                    this.books=Arrays.copyOf(this.books, this.books.length+1);
                    this.books[this.books.length-1]= bookManager.createBook();
                    break;
                case 2:
                    System.out.println("2 dobavit 4itatelya");
                    break;
                case 3:
                    System.out.println("3 vidat knigu");
                    break;
                case 4:
                    System.out.println("4 vernut knigu");
                    break;
                case 5:
                    System.out.println("5 spisok knig");
                    for (int i=0; i< books.length;i++){
                        Book book = books[i];
                        System.out.printf("Book{title = %s%n",book.getTitle());
                        System.out.print("\tAuthors=[\n\t\t");
                        for (int j = 0; j < book.getAuthors().length; j++){
                            Author author= book.getAuthors()[j];
                            System.out.printf("%s %s%n"
                                    ,author.getFirstname(),author.getLastname());
                            
                        }
                        break;
                    }
                            
                    
                    
                
                default:
                    System.out.println("viberite zada4u");       
            }
            
        }while(repeat);
    }
}
                   
            
  


        
        
        

