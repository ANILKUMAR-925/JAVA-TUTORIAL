package shape.org;

public class  Triangle{
    float a,b,c;
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findArea(){
        float s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.err.println("area is : "+ area);
    }
    public void findPerimeter(){
        System.err.println("perimeter is : "+ (a+b+c));
    }
}