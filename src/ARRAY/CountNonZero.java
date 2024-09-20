//program to find out how many non zero elements are there in a matrix

package ARRAY;
import java.util.Scanner;

public class CountNonZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows and columns of the matrix :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("enter the elements of the matrix : ");
        inputMatrix(mat, row, col);
        System.out.println("entered matrix is : ");
        display(mat, row, col);
        int res = count(mat, row, col);
        System.out.println("there are " + res + " nonzero elements are present in the matrix");
    }
    static void inputMatrix(int[][] mat, int row, int col){
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
    static int count(int[][] mat, int row, int col){
        int i, j , res=0;
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                if(mat[i][j] != 0){
                    res++;
                }
            }
        }
        return res;
    }
}
