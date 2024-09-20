//program to add two matrices

package ARRAY;
import java.util.*;
public class AddMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows and columns of the first matrix : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.print("enter the number of rows and columns of the second matrix : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(row1 != row2 && col1 != col2){
            System.out.println("can not add the matrices");
        }
        else{
            int[][] mat1 = new int[row1][col1];
            int[][] mat2 = new int[row2][col2];
            int[][] res = new int[row1][col1];
            System.out.println("enter the elements of the first matrix : ");
            inputMatrix(mat1,row1,col1);
            System.out.println("entered matrix is : ");
            display(mat1, row1, col1);
            System.out.println("enter the elements of the second matrix : ");
            inputMatrix(mat2,row2,col2);
            System.out.println("entered matrix is : ");
            display(mat2, row2, col2);
            add(mat1, mat2, res, row1, col1);
            System.out.println("addition of  matrix is : ");
            display(res, row1, col1);
        }
    }
    static   void inputMatrix(int[][] mat, int row, int col){
        Scanner sc = new Scanner(System.in);
        int i, j;
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    static void display(int[][] mat, int row, int col){
        int i, j;
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static void add(int[][] mat1, int[][] mat2, int[][] res, int row1, int col1){
        int i,j;
        for(i=0; i<row1; i++){
            for(j=0; j<col1; j++){
                res[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
    }
}
