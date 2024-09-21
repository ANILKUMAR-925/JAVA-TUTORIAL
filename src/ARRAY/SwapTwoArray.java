//program to swap the middle elements of the two arrays

package ARRAY;
import java.util.*;
public class SwapTwoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int i;
        System.out.print("enter the elements of the first array : ");
        input(arr1, size);
        System.out.print("enter the elements of the second array : ");
        input(arr2, size);
        swap(arr1,arr2);
        System.out.print("elements of the first array are : ");
        display(arr1);
        System.out.println();
        System.out.print("elements of the second array are : ");
        display(arr2);
    }
    static void input(int[] arr, int size){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }
    static void swap(int[] arr1, int[] arr2){
        int i;
        for(i=1;i<arr1.length-1;i++){
            int temp = arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
    }
    static void display(int[] arr){
        int i;
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
