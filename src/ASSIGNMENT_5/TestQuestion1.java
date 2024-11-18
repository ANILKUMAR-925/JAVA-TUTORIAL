package ASSIGNMENT_5;

import java.util.*;
class Parent{
    void f1(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    void f2(){
        System.out.println("This is child class");
    }
}
public class TestQuestion1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.f1();
        Child c = new Child();
        c.f2();
        c.f1();
    }
}
