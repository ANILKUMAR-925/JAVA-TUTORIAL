//program to find out the smallest and largest element in the array

package ARRAY;
import java.util.*;
public class SmallLarge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :  ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("enter the elements of the array : ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int small=getSmall(arr);
        int large=getLarge(arr);
        System.out.println("small elements of the array : " + small);
        System.out.println("largest elements of the array : " + large);
    }
    static int getSmall(int[] arr){
        int i, small=arr[0];
        for(i=0; i<arr.length; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
    static int getLarge(int[] arr){
        int i, large=arr[0];
        for(i=0; i<arr.length; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
}
