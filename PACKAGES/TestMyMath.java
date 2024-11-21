import btech.arithmatic.MyMath;
import java.ut

class TestMyMath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MyMath m = new MyMath();
        m.add(a, b); 
        m.sub(a, b);
        m.mult(a, b);
        m.div(a, b);
        m.mod(a, b);
    }
}