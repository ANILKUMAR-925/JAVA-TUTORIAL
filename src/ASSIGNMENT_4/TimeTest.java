//program to add two times by passing objects to method

package ASSIGNMENT_4;
import java.util.*;
class Time{
    int hour,min,sec;
    Time(){};
    Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    Time add(Time[] t){
        Time res = new Time();
        res.hour = t[0].hour + t[1].hour;
        res.min = t[0].min + t[1].min;
        res.sec = t[0].sec + t[1].sec;
        if(res.sec>=60){
            res.min++;
            res.sec-=60;
        }
        if(res.min>=60){
            res.hour++;
            res.min-=60;
        }
        return res;
    }
    void display(){
        System.out.print(hour + ":" + min + ":" + sec);
    }
}
public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time[] t = new Time[2];
        int i;
        for(i=0;i<2;i++){
            System.out.print("enter the time in hour,minute,second : ");
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            t[i] = new Time(hour,min,sec);
        }
        Time res = new Time();
        res = res.add(t);
        System.out.println("addion of time is : ");
        res.display();
    }
}
