package ASSIGNMENT_5;
import java.awt.*;
import java.util.*;

class Point2D{
    Scanner sc = new Scanner(System.in);
    int x, y;
    Point2D(){
        System.out.println("enter the x coordinate and y coordinate : ");
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }
    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("X coordinate : " + x);
        System.out.println("Y coordinate : "+ y);
    }
}
class Point3D extends Point2D{
    int z;
    Point3D(){
        super();
        System.out.println("enter the Z coordinate : ");
        z = sc.nextInt();
    }
    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    void show(){
        super.display();
        System.out.println("Z coordinate : "+ z);
    }
}
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3D p1 = new Point3D();
        p1.show();
    }
}
