//program to find out the gcd of two numbers

package ASSIGNMENT_1;
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc .nextInt();
        int small;
        if(a<b){
            small = a;
        }
        else{
            small = b;
        }
        int i , res=1;
        for(i=1; i<=small; i++){
            if(a%i == 0 && b%i == 0){
                res = i;
            }
        }
        System.out.println("GCD is " + res);
    }
}
