package THREAD;
import java.util.*;

class Thread1 extends Thread{
    int num;
    Thread1(int num){
        this.num = num;
    }
    public void run(){
        System.out.println("square of the number is : " + (num*num));
    }
}
class Thread2 extends Thread{
    int num;
    Thread2(int num){
        this.num = num;
    }
    public void run(){
        int i = num*num;
        int sum = 0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        System.out.println("sum of  the digits of square of the number is : " + sum);
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        Thread1 t1 = new Thread1(num);
        Thread2 t2 = new Thread2(num);
        t1.start();
        t2.start();
    }
}
