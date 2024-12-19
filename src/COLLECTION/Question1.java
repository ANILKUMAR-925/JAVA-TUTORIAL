//program to create arrayList which elements are replaceable
package COLLECTION;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        System.out.println("enter the index which you want to replace : ");
        int ind = sc.nextInt();
        if(ind>=0 && ind<fruit.size()){
            System.out.println("enter the replaceable data : ");
            String str = sc.next();
            System.out.println("list elements before replacing : " + fruit);
            fruit.set(ind,str);
            System.out.println("list elements after replacing : " + fruit);
        }
        else
            System.out.println("invalid index");
    }
}
