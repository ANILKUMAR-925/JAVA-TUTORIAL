package ASSIGNMENT_5;
import java.util.*;

class Figure{
    float dim1, dim2;
    Figure(float dim1){
        this.dim1 = dim1;
    }
    Figure(float dim1, float dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    float area(){
        return dim1*dim2;
    }
}
class Rectangle extends Figure{
    Rectangle(float length, float breadth){
        super(length, breadth);
    }

    @Override
    float area() {
        return super.area();
    }
}
class Triangle extends Figure{
    Triangle(float base, float height){
        super(base, height);
    }
    float area(){
        return super.area()/2;
    }
}
class Square extends Figure{
    Square(float side){
        super(side);
    }
    float area(){
        return dim1*dim1;
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and breadth of the rectangle : ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("enter the base and height of the rectangle : ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        Triangle t = new Triangle(base, height);
        System.out.println("enter the side of the square : ");
        float side = sc.nextFloat();
        Square s = new Square(side);
        System.out.println("area of the rectangle : "+ r.area());
        System.out.println("area of the triangle : "+ t.area());
        System.out.println("area of the square : "+ s.area());

    }
}
