import java.util.*;
import shape.org.Circle;
import shape.org.Square;
import shape.org.Triangle;

class TestShape{
    public static void main(String[] ergs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle : ");
        float r = sc.nextFloat();
        Circle c = new Circle(r);
        c.findArea();
        c.findPerimeter();
        System.out.println("enter the side of the square : ");
        float side = sc.nextFloat();
        Square s = new Square(side);
        s.findArea();
        s.findPerimeter();
        System.out.println("enter the sides of the triangle : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float d = sc.nextFloat();
        Triangle t = new Triangle(a, b, d);
        t.findArea();
        t.findPerimeter();
    }
}