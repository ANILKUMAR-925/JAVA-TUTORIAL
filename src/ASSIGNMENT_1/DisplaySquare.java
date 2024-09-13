//program to display 0 1 4 9 16 49 64 81 ......

package ASSIGNMENT_1;
import java.util.*;
public class DisplaySquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the term up to which you want to display : ");
        int n = sc.nextInt();
        int i;
        for(i=0; i<=n; i++){
            System.out.print(i*i + " ");
        }
        System.out.println();
        for(i=1; i<=n; i++){
            System.out.print((i*i) - (i-1)*(i-1) + " ");
        }
        System.out.println();
    }
}
