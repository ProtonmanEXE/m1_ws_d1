// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the interface for Day 1 Workshop

package main.java.workshopday1;

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCartInterface {
    
// variable declaration
    public static void main( String[] args ) {
        
        System.out.println("Welcome to your shopping cart");
        
        // variable declaration
        Scanner scan = new Scanner(System.in);
        String command = scan.next();
        String Item = scan.nextLine();
        String Item2 = Item.trim();
        Cart MyCart = new Cart();
        
        // this section forces user to input either list, add or delete
        while(!command.equals("list") && !command.equals("add") && !command.equals("delete")) {
            System.out.println("Shopping cart only accepts list, add or delete");
            command = scan.next(); // this is how you loop a scan
            Item = scan.nextLine();
            Item2 = Item.trim();
        }
        
        // this section specifies the workflow for list, add and delete
        while(command.equals("list") || command.equals("add") || command.equals("delete")) {
            
            // this section specifies the workflow for list
            if(command.equals("list")) {
                MyCart.listItem();
                command = scan.next();
                Item = scan.nextLine();
                Item2 = Item.trim();
            
            // this section specifies the workflow for add                
            } else if(command.equals("add")) {
                System.out.println("Item2 is " +Item2);
                MyCart.addItem(Item2);
                command = scan.next();
                Item = scan.nextLine();
                Item2 = Item.trim();

            // this section specifies the workflow for delete                
            } else if(command.equals("delete")) {
                System.out.println("delete");
                command = scan.next();
                Item = scan.nextLine();
                Item2 = Item.trim();
            
            }
            
        }           
        System.out.println("You are leaving shopping cart");
   
    }

}

// day 1_workshop: lessons learnt/mistakes made
// 
// 1) package location - if package main.java.workshopday1, then tnat means that your VSC folder
//    location must start from folder main and not any higher folders; otherwise, when handling
//    the class, an error "Exception in thread "main" java.lang.Error: Unresolved compilation 
//    problems: " will appear
// 2) import files - do remember to check whether your script contains all necessary import files,
//    otherwise, when compiling, an error "Exception in thread "main" java.lang.Error: 
//    Unresolved compilation problems:" can occurr
// 3) reading input using scanner - all my lines reading input susing scanner consists of three 
//    lines of code: 
//    "String command = scan.next();
//    String Item = scan.nextLine();
//    String Item2 = Item.trim();"
//    this is because 
