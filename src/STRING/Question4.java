//program to find substring of an string
package STRING;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        int i,j;
        System.out.println("sub string of " + str + " are : ");
        for(i=0; i<str.length(); i++){
            String temp = "";
            for(j=i; j<str.length(); j++){
                temp = temp +str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
