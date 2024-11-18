package EXCEPTION_HANDLING;
import java.util.*;

public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a-b==0){
            throw new ArithmeticException("denominator is zero so can not find the result");
        }
        else{
            System.out.println("result is : "+ a/(a-b));
        }
    }
}
