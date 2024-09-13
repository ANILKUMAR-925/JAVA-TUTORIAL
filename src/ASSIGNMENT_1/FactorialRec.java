//program to find out the factorial of a number using recursion

package ASSIGNMENT_1;
import java.util.*;
public class FactorialRec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number : ");
        int num = sc.nextInt();
        int res = find(num);
        System.out.println("factorial of " + num + " is " + res);
    }
    static int find(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * find(num-1);
        }
    }
}
