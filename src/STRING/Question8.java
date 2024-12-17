//program to check whether two strings are anagram or not
package STRING;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("enter second string : ");
        String str2 = sc.nextLine();
        if(str1.length() == str2.length()){
            String temp1 = str1.toLowerCase();
            String temp2 = str2.toLowerCase();
            if(isAnagram(temp1,temp2)){
                System.out.println("the input strings are anagram");
            }
            else{
                System.out.println("the input strings are not anagram");
            }
        }
        else{
            System.out.println("the input strings are not anagram");
        }
    }
    static boolean isAnagram(String str1, String str2){
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        int i;
        for (i=0; i<str1.length(); i++){
            arr1[str1.charAt(i)]++;
            arr2[str2.charAt(i)]++;
        }
        boolean check = true;
        for (i=0; i<256; i++){
            if(arr1[i] != arr2[i]) {
                check = false;
                break;
            }
        }
        return check;
    }
}
