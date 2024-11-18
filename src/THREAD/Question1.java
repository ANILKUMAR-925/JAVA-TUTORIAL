package THREAD;
import java.util.*;

class Child extends Thread{
    int m,n;
    Child(int m, int n){
        this.m =m;
        this.n = n;
    }
    public void run(){
        int i;
        for (i=m; i<=n; i++){
            if(i%2!=0){
                System.out.println("child : " + i);
            }
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the range : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Child c = new Child(m,n);
        c.start();
        int i;
        for (i=m; i<=n; i++){
            if(i%2==0){
                System.out.println("parent : " + i);
            }
        }
    }
}
