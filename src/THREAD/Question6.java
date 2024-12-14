package THREAD;
import java.util.*;

class Producer extends Thread{
    int[] arr;
    Producer(int[] arr){
        this.arr = arr;
    }
    public void run(){
        int i;
        for(i=0; i<10; i++){
            arr[i] = (int) (100*Math.random());
        }
    }
}
class Consumer extends Thread{
    int[] arr;
    static int count;
    Consumer(int[] arr){
        this.arr = arr;
    }
    public void run(){
        int i;
        for(i=0; i<10; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
    }
}
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Producer p = new Producer(arr);
        p.start();
        Consumer c = new Consumer(arr);
        c.start();
        try{
            p.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("random numbers are : ");
        for(int em : arr){
            System.out.print(em + "  ");
        }
        System.out.println();
        System.out.println("total "+ Consumer.count +" even numbers are generated");
    }
}
