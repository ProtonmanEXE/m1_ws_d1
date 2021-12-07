// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the class Cart for Day 1 Workshop

package workshopday1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
// variable declaration
ArrayList<String> MyCart = new ArrayList<String>();
String Item;
String AllItems2;
String AllItems3;
int i=0, j=0;

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
        Scanner AllItems = new Scanner(Item);
        AllItems.useDelimiter("[,\n]");
        while (AllItems.hasNext()) {
            AllItems2 = AllItems.next();
            AllItems3 = AllItems2.trim();
            MyCart.add(i, AllItems3);
            i++;
        }
                 
        System.out.println(AllItems);
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

    