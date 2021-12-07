// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the interface for Day 1 Workshop

package workshopday1;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("Please use list, add or delete");
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
                System.out.println("Entry command is " +command);
                System.out.println("Item2 is " +Item2);
                MyCart.addItem(Item2);
                command = scan.next();
                Item = scan.nextLine();
                Item2 = Item.trim();
                System.out.println("Item2 2 is " +Item2);
                System.out.println("Second command is " +command);

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
