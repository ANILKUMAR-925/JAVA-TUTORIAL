//program to store all the prime numbers between m to n and print the 3rd one

package ARRAY;
import java.util.*;
public class PrimeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower bound : ");
        int m = sc.nextInt();
        System.out.print("enter the upper bound : ");
        int n = sc.nextInt();
        int[] arr = new int[n-m+2];
        if(m>n){
            System.out.println("lower bound should be smaller than upper bound");
        }
        else{
            int i, j, k=0;
            for(i=m; i<=n; i++){
                if(i==0 || i==1){
                    continue;
                }
                else if(i == 2){
                    arr[k++]=i;
                }
                else{
                    boolean check = true;
                    for(j=2; j<=i/2; j++){
                        if(i%j == 0){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        arr[k++] = i;
                    }
                }
            }
            if(arr[2] != 0){
                System.out.println("third prime number is " + arr[2]);
            }
            else{
                System.out.println("Less than 3 prime numbers present in the interval");
            }
        }
    }
}
