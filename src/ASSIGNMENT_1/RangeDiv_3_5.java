//program to print all the numbers between m and n which are divisible by 3 and 5

package ASSIGNMENT_1;
import java.util.*;
public class RangeDiv_3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of m : ");
        int m = sc.nextInt();
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        if(m > n){
            System.out.println("m should be less than n");
        }
        else{
            int i, count = 0;
            System.out.print("numbers divisible by 3 and 5 are :  ");
            for(i = m; i <= n; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    count ++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("total " + count + " numbers are divisible by 3 and 5 between " + m + " and " + n);
        }
    }
}
