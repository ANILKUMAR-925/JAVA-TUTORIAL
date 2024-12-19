//program to reverse the words of a sentence using stack
package COLLECTION;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence : ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Stack<String> stk = new Stack<>();
        for(String temp : arr){
            stk.push(temp);
        }
        System.out.println("reverse of the sentence is : ");
        while(!stk.isEmpty()){
            System.out.print(stk.pop() + " ");
        }
        System.out.println();
    }
}
