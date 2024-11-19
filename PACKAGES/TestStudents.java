import btech.Students;
import java.util.*;

class TestStudents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("neter  roll number : ");
        int rollNo = sc.nextInt();
        System.out.print("enter name : ");
        String name = sc.next();
        System.out.print("enter the marks in three subjects : ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        Students s = new Students(rollNo, name, sub1, sub2, sub3);
        s.display();
    }
}