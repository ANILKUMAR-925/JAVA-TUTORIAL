//program to store the details of items

package ASSIGNMENT_4;
import java.util.*;
class Item{
    String name;
    double price;
    int quantity;
    Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
    //returns current inventory value
    double getValue(){
        return quantity*price;
    }
}
public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] a = new Item[3];
        int i;
        for (i=0; i<3; i++){
            System.out.println("enter the name, price and quantity of " + (i+1) + "th item : ");
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            a[i] = new Item(name, price, quantity);
        }
        System.out.printf("%-15s %-15s %-15s %-20s%n", "NAME", "PRICE", "QUANTITY", "CURRENT INVENTORY VALUE");
        for (i=0; i<3; i++){
            System.out.printf("%-15s %-15s %-15s %-20s%n", a[i].getName(), a[i].getPrice(), a[i].getQuantity(), a[i].getValue());
        }
    }
}
