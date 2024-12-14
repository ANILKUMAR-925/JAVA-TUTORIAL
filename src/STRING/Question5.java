//program to print reverse of a string
package STRING;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        int i;
        System.out.print("reverse of " + str + " is : ");
        for (i=str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
