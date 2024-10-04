//program to store the details of a student and calculate the grade

package ASSIGNMENT_4;
import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    String name;
    int rollNo;
    char grade;
    int paper1, paper2, paper3;
    Student(){
        System.out.print("enter the name and  roll number : ");
        name = sc.next();
        rollNo = sc.nextInt();
        System.out.print("enter the mark in three subjects out of 100 : ");
        paper1 = sc.nextInt();
        paper2 = sc.nextInt();
        paper3 = sc.nextInt();
    }
    void calGrade(){
        int avg = (paper1 + paper2 + paper3)/3;
        switch(avg/10){
            case 10 :
            case 9 :
                grade = 'O';
                break;
            case 8 :
                grade = 'E';
                break;
            case 7 :
                grade = 'A';
                break;
            case 6 :
                grade = 'B';
                break;
            case 5 :
                grade = 'C';
                break;
            case 4 :
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
    }
    void showDetails(){
        calGrade();
        System.out.printf("%-15s %-10s %-10s%n", name, rollNo, grade);
    }
}
public class TestStudent {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        int i;
        for (i = 0; i < 3; i++) {
            s[i] = new Student();
        }
        System.out.println("details of the students are : ");
        System.out.printf("%-15s %-10s %-10s%n", "NAME", "ROLL NO", "GRADE");
        for (i = 0; i < 3; i++) {
            s[i].showDetails();
        }
    }
 }
