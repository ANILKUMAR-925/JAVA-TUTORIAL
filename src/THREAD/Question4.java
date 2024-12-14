package THREAD;
import java.util.*;

class SumThread extends Thread{
    static int globalSum;
    int n;
    int[] arr;
    SumThread(int n){
        this.n = n;
        arr = new int[n];
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements for the thread : ");
        int i;
        synchronized (this){
            for (i=0; i<n; i++){
                arr[i] = sc.nextInt();
                globalSum+=arr[i];
            }
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("enter the number of thread : ");
        int m = sc.nextInt();
        SumThread[] t = new SumThread[m];
        int range = n/m, i;
        for(i=0; i<m; i++){
            t[i] = new SumThread(range);
            if(i == m-2){
                range= n-(i+1)*range;
            }
            t[i].start();
            try{
                t[i].join();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("sum of the elements : "+ SumThread.globalSum);
    }
}
