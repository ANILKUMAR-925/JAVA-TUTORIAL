//code to find add two numbers

package ASSIGNMENT_1;
import java.util.Scanner;
public class NumAddition {

    public static void main(String[] args){
        int c;
        c = add();
        System.out.println("addition is : " + c);
    }
    static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }
}
