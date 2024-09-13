//code to find out the reverse of a number

package ASSIGNMENT_1;
import java.util.Scanner;
public class NumReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number : ");
        a = sc.nextInt();
        int rev = reverse(a);
        System.out.println("reverse of " + a + " is : " + rev);
    }
    static int reverse(int num){
        int rev = 0;
        int rem;
        while(num>0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
}
