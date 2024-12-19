//program to create two linkedList and check whether both list contain same elements are not
package COLLECTION;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of the linkedList : ");
        int len = sc.nextInt();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        int i,j;
        System.out.println("enter the colors of the first list : ");
        for(i=0;i<len;i++){
            list1.add(sc.next());
        }
        System.out.println("enter the colors of the second list : ");
        for(i=0;i<len;i++){
            list2.add(sc.next());
        }
        boolean res = true;
        for(String str1 : list1){
            res = false;
            for(String str2 : list2){
               if(str1.equals(str2)){
                   res = true;
               }
            }
            if(!res){
                System.out.println("the elements of both the list are not same");
                break;
            }
        }
        if(res){
            System.out.println("the elements of both the list are same");
        }
    }
}
