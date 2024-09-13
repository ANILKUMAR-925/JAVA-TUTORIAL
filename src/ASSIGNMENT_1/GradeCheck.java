//program to print the grade of a student in 3 subject

package ASSIGNMENT_1;
import java.util.*;
public class GradeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark obtained in first subject : ");
        int a = sc.nextInt();
        System.out.print("enter the mark obtained in second subject : ");
        int c = sc.nextInt();
        System.out.print("enter the mark obtained in third subject : ");
        int b = sc.nextInt();
        int avg = (a + b + c)/3;
        switch(avg/10){
            case 10 :
            case 9 :
                System.out.println("Congratulation you get \"O\" Grade");
                break;
            case 8 :
                System.out.println("Congratulation you get \"E\" Grade");
                break;
            case 7 :
                System.out.println("you get \"A\" Grade");
                break;
            case 6 :
                System.out.println("you get \"B\" Grade");
                break;
            case 5 :
                System.out.println("you get \"C\" Grade");
                break;
            case 4 :
                System.out.println("you get \"D\" Grade");
                break;
            default:
                System.out.println("you get \"F\" Grade");
        }
    }
}
