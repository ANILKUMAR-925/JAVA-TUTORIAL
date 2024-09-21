//program to delete duplicate elements of the array

package ARRAY;
import java.util.*;
public class DeleteDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter tye size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i,j;
        System.out.println("enter the array elements : ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<size-1; i++){
            for(j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    size = delete(arr,j,size);
                }
            }
        }
        System.out.println("array elements are : ");
        for(i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int delete(int[] arr, int index, int size){
        if(index == size-1){
            return size-1;
        }
        else{
            int i;
            for(i=index; i<size-1; i++){
                arr[i] = arr[i+1];
            }
            return size-1;
        }
    }
}