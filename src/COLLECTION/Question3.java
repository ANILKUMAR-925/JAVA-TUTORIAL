//program to create two hash set and store the common elements in a tree set
package COLLECTION;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(5);
        set2.add(6);
        set2.add(10);
        System.out.println("elements of set 1 : " + set1);
        System.out.println("elements of set 2 : " + set2);
        TreeSet<Integer> tree = new TreeSet<>();
        for(int em : set1){
            if(set2.contains(em)){
                tree.add(em);
            }
        }
        System.out.println("tree elements are : " + tree);
    }
}
