//code to add first n numbers
package ASSIGNMENT_1;
import java.util.Scanner;
public class AddNNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int a = sc.nextInt();
        int res = add(a);
        System.out.println("addition of first " + a + " numbers is " + res);
    }
    static int add(int n){
        return (n * ( n+ 1)) / 2;
    }
}
