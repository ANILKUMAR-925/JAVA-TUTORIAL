//code to find out the factorial of a number

package ASSIGNMENT_1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println("factorial of " + a + " is " + res);
    }
    static int fact(int num){
        if(num == 0){
            return 1;
        }
        else{
            int i;
            int res =1;
            for(i=1;i<=num;i++){
                res = res * i;
            }
            return res;
        }
    }
}
