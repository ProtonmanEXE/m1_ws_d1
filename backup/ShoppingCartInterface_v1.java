// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the interface for Day 1 Workshop

package main.java.workshopday1;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartInterface {
    
// variable declaration
String scan;
String command;
ArrayList<String> MyCart;

    public static void main( String[] args ) {
        
        System.out.println("Welcome to your shopping cart");

        Scanner scan = new Scanner(System.in);
        String command = scan.next();
    
        // this section forces user to input either list, add or delete
        while(!command.equals("list") && !command.equals("add") && !command.equals("delete")) {
            System.out.println("Please use list, add or delete");
            command = scan.next(); // this is how you loop a scan
        }
        
        ArrayList<String> MyCart = new ArrayList();
        // MyCart.add("Ferrai");
        // MyCart.add("Orange");
        // this section specifies the workflow for list, add and delete
        while(command.equals("list") || command.equals("add") || command.equals("delete")) {
            if(command.equals("list")) {
                if(MyCart.size()==0) {
                    System.out.println("list");
                    command = scan.next();

                } else {
                    for(int i = 1; i-1 < MyCart.size(); i++) {
                    System.out.println(i + ". " + MyCart.get(i-1));
                    }
                    command = scan.next();
                }

            } else if(command.equals("add")) {
            
                System.out.println("add");
                command = scan.next();

                } else if(command.equals("delete")) {
                System.out.println("delete");
                command = scan.next();
                // if you script it like this, the loop does not work when you key in two or more
                // words as the scan.next() function will cause the second word to be input into 
                // variable "command" instead of only the first word as intended because the 
                // leftover words must be recorded somewhere
            }
            
        }           
        System.out.println("You are leaving shopping cart");
   
    }
}
