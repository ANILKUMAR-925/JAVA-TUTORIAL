//program to print the Fibonacci series up to n th term

package ASSIGNMENT_1;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the term up to which you want to print : ");
        int n = sc.nextInt();
        int i;
        for(i = 1; i <= n; i++){
            System.out.print(find(i) + " ");
        }
        System.out.println();
    }
    static int find(int n){
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return (find(n-1) + find(n-2));
        }
    }
}
