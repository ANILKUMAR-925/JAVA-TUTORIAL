package ASSIGNMENT_5;
import java.util.*;

class Shape {
    void draw() {
        System.out.println("drawing shape");
    }
    void erase(){
        System.out.println("erasing shape");
    }
}
class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
    void erase(){
        System.out.println("erasing circle");
    }
}
class Triangle1 extends Shape {
    void draw() {
        System.out.println("drawing triangle");
    }
    void erase(){
        System.out.println("erasing triangle");
    }
}
class Square1 extends Shape {
    void draw() {
        System.out.println("drawing square");
    }
    void erase(){
        System.out.println("erasing square");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Triangle1 t = new Triangle1();
        Square1 s = new Square1();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}
