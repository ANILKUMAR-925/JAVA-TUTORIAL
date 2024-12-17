//program to find out the number of occurance of each character in a string
package STRING;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        int[] arr = new int[256];
        int i;
        for (i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for (i=0; i<256; i++){
            if(arr[i]>0)
                System.out.println("the character "+ (char)i + " occured " + arr[i] + " times");
        }
    }
}
