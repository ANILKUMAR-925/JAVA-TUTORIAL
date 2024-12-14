package THREAD;
import java.util.*;

class MyThread1 extends Thread{
    int[] arr1;
    int[] arr2;
    int[] res;
    MyThread1(int[] arr1, int[] arr2, int[] res){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.res = res;
    }
    public void run(){
        int i;
        for(i=1; i<arr1.length; i+=2){
            res[i] = arr1[i]*arr2[i];
        }
    }
}
class MyThread2 extends Thread{
    int[] arr1;
    int[] arr2;
    int[] res;
    MyThread2(int[] arr1, int[] arr2, int[] res){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.res = res;
    }
    public void run(){
        int i;
        for(i=0; i<arr1.length; i+=2){
            res[i] = arr1[i]*arr2[i];
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        int[] res = new int[len];
        int i;
        System.out.println("enter the elements of the first array : ");
        for(i=0; i<len; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements of the second array : ");
        for(i=0; i<len; i++){
            arr2[i] = sc.nextInt();
        }
        MyThread1 t1 = new MyThread1(arr1, arr2, res);
        MyThread2 t2 = new MyThread2(arr1, arr2, res);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("elements of resultant array  are : ");
        for(i=0; i<res.length; i++){
            System.out.print(res[i] + "  ");
        }
    }
}
