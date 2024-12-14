// converting a string with multiple spaces to single space
package STRING;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        str = str.trim();
        String temp ="";
        int i,j;
        for(i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr!=' '){
                temp = temp + curr;
            }
            else{
                j=i+1;
                while (str.charAt(j) == ' ') {
                    j++;
                }
                temp = temp + ' ';
                i = j-1;
            }
        }
        str = temp;
        System.out.println(str);
    }
}
