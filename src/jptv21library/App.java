/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
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
                    break;    
                            
                    
                    
                
                default:
                    System.out.println("viberite zada4u");       
            }
            
        }while(repeat);
    }
}
                    
            
  


        
        
        

