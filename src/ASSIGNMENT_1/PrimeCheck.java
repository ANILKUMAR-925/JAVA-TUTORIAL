//code to check the inputted number is a prime number or not

package ASSIGNMENT_1;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        boolean check = isPrime(a);
        if(check){
            System.out.println(a + " is a prime number");
        }
        else{
            System.out.println(a + " is not a prime number");
        }
    }
    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        else if(num == 2){
            return true;
        }
        else{
            int i;
            boolean check = true;
            for(i = 2;i <= num / 2 + 1;i++){
                if(num % i == 0) {
                    check = !check;
                    break;
                }
            }
            return check;
        }
    }
}
