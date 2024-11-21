package ASSIGNMENT_5;
import java.util.*;

abstract class Figure2{
    float dim1, dim2;
    abstract float getArea();
}
class Rectangle2 extends Figure2{
    float getArea(){
        return dim1*dim2;
    }
}
class Triangle2 extends Figure2{
    @Override
    float getArea() {
        return (dim1*dim2)/2;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle2 r = new Rectangle2();
        System.out.println("enter the length and breadth of the rectangle : ");
        r.dim1 = sc.nextFloat();
        r.dim2 = sc.nextFloat();
        Triangle2 t = new Triangle2();
        System.out.println("enter the base and height of the triangle : ");
        t.dim1 = sc.nextFloat();
        t.dim2 = sc.nextFloat();
        System.out.println("area of the rectangle is : "+ r.getArea());
        System.out.println("area of the triangle is : "+ t.getArea());
    }
}
