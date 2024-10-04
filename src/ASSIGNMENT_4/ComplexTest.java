//program to add two complex numbers

package ASSIGNMENT_4;
import java.util.*;
class Complex{
    float real;
    float img;
    Complex(){};
    Complex(float real, float img){
        this.real = real;
        this.img = img;
    }
    Complex add(Complex[] c){
        Complex res = new Complex();
        res.real = c[0].real + c[1].real;
        res.img = c[0].img + c[1].img;
        return res;
    }
    void display(){
        if(img>=0){
            System.out.println(real + "+" + img + "i");
        }
        else{
            System.out.println(real + img + "i");
        }
    }
}
public class ComplexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex[] c = new Complex[2];
        int i;
        for(i=0;i<2;i++){
            System.out.print("enter real and imaginary part : ");
            float real = sc.nextFloat();
            float img = sc.nextFloat();
            c[i] = new Complex(real,img);
        }
        Complex res = new Complex();
        res = res.add(c);
        System.out.println("addition is : ");
        res.display();
    }
}
