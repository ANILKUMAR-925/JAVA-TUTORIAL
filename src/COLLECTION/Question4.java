//program to remove the elements of a tree below the specified value
package COLLECTION;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();
        System.out.println("enter the total number of elements in the tree : ");
        int len = sc.nextInt();
        int i;
        System.out.println("enter the elements of the tree : ");
        for(i=0; i<len; i++){
            tree.add(sc.nextInt());
        }
        System.out.println("enter the specified value : ");
        int val = sc.nextInt();
        System.out.println("tree elements before deletion : " + tree);
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            int em = iterator.next();
            if (em < val) {
                iterator.remove();
            }
        }
        System.out.println("tree elements after deletion : "+ tree);
    }
}
