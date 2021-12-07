// Dev.: ProtonmanEXE
// Dev. Notes: 
// this is the class Cart for Day 1 Workshop

package workshopday1;

import java.util.ArrayList;

public class Cart {
// variable declaration
ArrayList<String> MyCart = new ArrayList<String>();
String Item;

    public String listItem() {
        System.out.println(MyCart);
        return "Went to list";
    }

    public void addItem(String Item) {
        this.Item = Item;
        MyCart.add(Item);
        MyCart.add("Aiyoyo");
    }

    // public String deleteItem(int i) {
    //     if(!cart.isEmpty()) {
    //         cart.remove(i);
    //         return "Item removed";

    //     } else
    //         return "Your cart is empty";
        
    //     }
    // }

    // if(MyCart.size()==0) {
    //     System.out.println("list");
    //     command = scan.next();
    
    // } else {
    //     for(int i = 1; i-1 < MyCart.size(); i++) {
    //     System.out.println(i + ". " + MyCart.get(i-1));
    //     }
}