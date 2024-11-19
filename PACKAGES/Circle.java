package shape.org;

public class Circle{
    float r;
    public Circle(float r){
        this.r = r;
    }
    public void findArea(){
        System.out.println("area is : "+ (3.14*r*r));
    }
    public void findPerimeter(){
        System.err.println("perimeter is  :" + (2*3.14*r));
    }
}
