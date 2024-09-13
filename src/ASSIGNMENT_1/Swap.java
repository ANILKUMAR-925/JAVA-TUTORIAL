//code to swap the values of two variable without using a third variable

package ASSIGNMENT_1;
import  java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("value of a and b before swapping is " + a + " ," + b + " respectively");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a and b after swapping is " + a + " ," + b + " respectively");
    }
}