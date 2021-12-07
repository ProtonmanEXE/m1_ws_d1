// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the class Cart for Day 1 Workshop

import java.util.ArrayList;
import java.util.Scanner;

public class Cart2 { // I had to use "Cart2" because for some reason, the main script does not accept "Cart"
// variable declaration
ArrayList<String> MyCart = new ArrayList<String>();
String Item;
String AllItems2;
String AllItems3;
int j, a;
Boolean Check = true; // I must initialise Check as true, otherwise, the first pass when the 
                      // cart is empty, Check is null and cannot proceed

    // this section specifies the method list                
    public void listItem() {

        // tells user that cart is empty
        if(MyCart.size()==0) {
            System.out.println("Your cart is empty");
    
        // tells user all objects in cart in sequential order
        } else {
            for(int i = 1; i-1 < MyCart.size(); i++) {
            System.out.println(i + ". " + MyCart.get(i-1));
            }
        }
    }

    // this section specifies the method addItem                
    public void addItem(String Item) {
        this.Item = Item;
        
        // tells user that add is empty                
        if(Item.isEmpty()) {
            System.out.println("Your add is empty");
            System.out.println("Please try again");
            
        // decides whether to add item to cart                
        } else {
            Scanner AllItems = new Scanner(Item);
            AllItems.useDelimiter("[,\n]");

            while (AllItems.hasNext()) {
                AllItems2 = AllItems.next();
                AllItems3 = AllItems2.trim();
                j = 0; // intialise j for the for loop

                // checks whether is there duplicate item in the cart              
                for(int i = 0; i < MyCart.size(); i++) {
                    
                    if(AllItems3.equals(MyCart.get(j))) {
                        Check = false;
                        break;

                    } else {
                        j++;
                        Check = true;

                    }
                    
                }
                if(Check) {
                    MyCart.add(AllItems3);
                    System.out.println(AllItems3 +" added to cart");

                }   else    
                    System.out.println("You already have " +AllItems3 +" in your cart");
              
            }
        
        }
        
    }
                 
    // this section specifies the method deleteItem                
    public void deleteItem(String Item) {
    this.Item = Item;
    
    // tells user that delete is empty                
    if(Item.isEmpty()) {
        System.out.println("Your delete is empty");
        System.out.println("Please try again");
        
    // decides whether to add item to cart                
    } else if(Item.matches("[0-9]+")) { // this condition checks whether delete no. is an integer
        a = Integer.valueOf(Item);

        if(a <= MyCart.size()) { // this condition check whether delete no. equal to or smaller than size
            System.out.println(MyCart.get(a-1) + " removed from cart"); 
            MyCart.remove(a-1);

        } else {
            System.out.println("Incorrect item index");
            System.out.println("Please try again");

        }

    } else
    System.out.println("You did not key in a number to specify which item to delete");

    }

}