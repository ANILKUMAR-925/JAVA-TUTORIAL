//code to find out the transpose of a matrix

package ARRAY;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows and columns of the matrix : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        int[][] res = new int[col][row];
        System.out.println("enter the elements of the matrix : ");
        input(mat, row, col);
        System.out.println("entered matrix is : ");
        display(mat, row, col);
        find(mat, res, row, col);
        System.out.println("transpose of the matrix is : ");
        display(res, col, row);
    }
    static void input(int[][] mat, int row, int col){
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    static void display(int[][] mat, int row, int col){
        int i,j;
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void find(int[][] mat, int[][] res, int row, int col){
        int i,j;
        for(i=0; i<col; i++){
            for(j=0; j<row; j++){
                res[i][j] = mat[j][i];
            }
        }
    }
}