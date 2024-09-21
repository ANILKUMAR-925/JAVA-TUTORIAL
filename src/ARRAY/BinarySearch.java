//program to search an element in the array using binary search

package ARRAY;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("enter the array elements in ascending order  : ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element you want to search : ");
        int num = sc.nextInt();
        int check = search(arr, num);
        if(check!=-1){
            System.out.println(num + " is present at index " + check);
        }
        else{
            System.out.println(num + " is not present in the array");
        }
    }
    static int search(int[] arr, int num){
        int low = 0, high = arr.length-1, mid = (low+high)/2;
        while(low <= high){
            if(num==arr[mid]){
                return mid;
            }
            else if(num<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }


}
