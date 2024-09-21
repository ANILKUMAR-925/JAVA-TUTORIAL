//program  to find how many times each elements of the array is present in the array

package ARRAY;
import java.util.*;
public class CountTimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("enter the elements of the array : ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int small = getSmall(arr);
        int large = getLarge(arr);
        int[] tempArr = new int[large-small +1];
        count(arr, tempArr, small);
        for(i=0; i<tempArr.length; i++){
            if(tempArr[i]!=0){
                System.out.println(i+small + " is present " + tempArr[i] + " times in the array");
            }
        }
    }
    static int getSmall(int[] arr){
        int i, small=arr[0];
        for(i=1; i<arr.length; i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        return small;
    }
    static int getLarge(int[] arr){
        int i, large=arr[0];
        for(i=1; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    static void count(int[] arr, int[] tempArr, int small){
        int i;
        for(i=0; i<arr.length; i++){
            tempArr[arr[i] - small]++;
        }
    }
}
