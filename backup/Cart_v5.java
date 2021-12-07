// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the class Cart for Day 1 Workshop

package main.java.workshopday1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
// variable declaration
ArrayList<String> MyCart = new ArrayList<String>();
String Item;
String AllItems2;
String AllItems3;
int j;
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
                    System.out.println(MyCart.get(j));
                    
                    if(AllItems3.equals(MyCart.get(j))) {
                        Check = false;
                        break;

                    } else {
                        j++;
                        Check = true;

                    }
                    
                }
                System.out.println("Check " +Check);
                if(Check) {
                    MyCart.add(AllItems3);
                    System.out.println(AllItems3 +" added to cart");

                }   else    
                    System.out.println("You already have " +AllItems3 +" in your cart");

            }
        
        }
                 
        //         if(AllItems3 == MyCart.get(i)) {
        //             Check = 0;
        //             System.out.println("Check " +Check);
        //             break;

        //         } else Check = 1;
        //         }
            // }                
    //         MyCart.add(i, AllItems3);
    //         i++;
    }
}
    // public String deleteItem(int i) {
    //     if(!cart.isEmpty()) {
    //         cart.remove(i);
    //         return "Item removed";

    //     } else
    //         return "Your cart is empty";
        
    //     }
    // }

    