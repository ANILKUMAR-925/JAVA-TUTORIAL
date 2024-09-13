/*
    program to print the following pattern
    1
    1 2
    1 2 3
    1 2 3 4
 */

package ASSIGNMENT_1;
import java.util.*;
public class NumTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows you want to print : ");
        int row = sc.nextInt();
        int i,j;
        for(i = 1; i <= row; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
