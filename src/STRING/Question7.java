//program to capitalize each word of a string
package STRING;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        StringBuffer str = new StringBuffer(sc.nextLine());
        int i;
        for (i = 0; i < str.length() - 1; i++) {
            if (i == 0 && (int) str.charAt(i) >= 97) {
                str.setCharAt(i, (char) ((int) str.charAt(i) - 32));
            }
            else if(str.charAt(i)==' ' && (int) str.charAt(i+1) >= 97){
                str.setCharAt(i+1, (char) ((int) str.charAt(i+1) - 32));
                i++;
            }
        }
        System.out.println(str);
    }
}
