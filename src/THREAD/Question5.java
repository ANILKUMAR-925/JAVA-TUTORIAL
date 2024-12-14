package THREAD;
import java.util.*;

class MinThread extends Thread{
    int[] arr;
    int start, end;
    static int globalMin;
    MinThread(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end =end;
        if(start == 0){
            globalMin = arr[start];
        }
    }
    public void run(){
        int localMin = arr[start];
        int i;
        for(i=start+1; i<=end; i++){
            if(arr[i]<localMin){
                localMin = arr[i];
            }
        }
        synchronized (this){
            if(globalMin>localMin){
                globalMin = localMin;
            }
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array : ");
        int len  = sc.nextInt();
        int i;
        int[] arr = new int[len];
        System.out.println("enter the elements of the array : ");
        for (i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number of thread : ");
        int m = sc.nextInt();
        int start = 0, end, range = len/m;
        end = range-1;
        MinThread[] t = new MinThread[m];
        for(i=0; i<m; i++){
            t[i] = new MinThread(arr, start, end);
            start += range;
            end += range;
            if(i==m-2){
                end = len-1;
            }
            t[i].start();
            try{
                t[i].join();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("minimum elements of the array : "+ MinThread.globalMin);
    }
}
