package shape.org;

public class Square{
    float side;
    public Square(float side){
        this.side = side;
    }
    public void findArea(){
        System.out.println("area is : "+ (side*side));
    }
    public void findPerimeter(){
        System.err.println("perimeter is : "+ (4*side));
    }
}