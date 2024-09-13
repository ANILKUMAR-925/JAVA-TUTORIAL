//program to find out the sum of digits of a number

package ASSIGNMENT_1;
import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();
        int res = find(a);
        System.out.println("sum of digits of " + a + " is " + res);
    }
    static int find(int num){
        int res = 0;
        while(num > 0){
            res += num % 10;
            num = num / 10;
        }
        return res;
    }
}