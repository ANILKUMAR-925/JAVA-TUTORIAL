package ASSIGNMENT_5;
import java.util.*;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name : "+ name);
    }
}
class Employee extends Person{
    private int empId;
    Employee(String name, int empId){
        super(name);
        this.empId = empId;
    }
    void display(){
        super.display();
        System.out.println("Employee ID : "+ empId);
    }
}
class HourlyEmployee extends Employee{
    private int hourlyRate, hoursWorked;
    HourlyEmployee(String name, int empId, int hourlyRate, int hoursWorked){
        super(name, empId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    int getGrossPay(){
        return hourlyRate*hoursWorked;
    }
    void display(){
        super.display();
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hourly Worked : " + hoursWorked);
        System.out.println("Gross Pay : " + getGrossPay());
    }
}
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name, employee id, hourly rate, hourly worked : ");
        String name = sc.nextLine();
        int empId = sc.nextInt();
        int hourlyRate = sc.nextInt();
        int hoursWorked = sc.nextInt();
        HourlyEmployee h = new HourlyEmployee(name, empId, hourlyRate, hoursWorked);
        h.display();
    }
}
