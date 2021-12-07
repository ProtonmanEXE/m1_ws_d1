// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the class Cart for Day 1 Workshop

package workshopday1;

import java.util.ArrayList;

public class Cart {
// variable declaration
public Cart () {}
    
    ArrayList<String> Cart;

    public void addItem(String Item) {
        Cart.add(Item);
    }


    public String deleteItem(int i) {
        if(Cart.size()==0) {
            Cart.remove(i);
            return "Item removed";

        } else
            return "Your cart is empty";
        
        }
    }

