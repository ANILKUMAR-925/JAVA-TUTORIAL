//program to sort a array using bubble sort

package ARRAY;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("enter the elements of the array ; ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, size);
        System.out.println("array elements after sorting : ");
        for(i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void sort(int[] arr, int size){
        int i,j;
        for(i=0; i<size-1; i++){
            for(j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
