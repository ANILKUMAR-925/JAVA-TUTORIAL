//program to find out the sum of diagonal elements of a matrix

package ARRAY;
import java.util.*;
public class DiagonalAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows of the matrix :");
        int row = sc.nextInt();
        int[][] mat = new int[row][row];
        System.out.println("enter the elements of the square matrix : ");
        inputMatrix(mat, row);
        System.out.println("entered matrix is : ");
        display(mat, row);
        int res = find(mat, row);
        System.out.println("addition of diagonal elements is : " + res);
    }
    static void inputMatrix(int[][] mat, int row){
        Scanner sc = new Scanner(System.in);
        int i, j;
        for(i=0; i<row; i++){
            for(j=0; j<row; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    static void display(int[][] mat, int row){
        int i, j;
        for(i=0; i<row; i++){
            for(j=0; j<row; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static int find(int[][] mat, int row){
        int i, res=0;
        for(i=0; i<row; i++){
            res += mat[i][i];
        }
        return res;
    }
}
