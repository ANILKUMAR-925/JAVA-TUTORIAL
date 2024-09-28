//program to show the details of the employees in a tabular form

package ASSIGNMENT_4;

class Employee{
    String empName;
    int empNo;
    float basicSalary, da, hra, grossSalary;
    Employee(String empName, int empNo, float basicSalary){
        this.empName = empName;
        this.empNo = empNo;
        this.basicSalary = basicSalary;
        da = (basicSalary*20)/100;
        hra = (basicSalary*10)/100;
    }
    void calGrossSal(){
        grossSalary = basicSalary + da + hra;
    }
    void showEmpDetails(){
        calGrossSal();
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s%n", empName, empNo, basicSalary, da, hra, grossSalary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee a1 = new Employee("Ram", 1, 50000);
        Employee a2 = new Employee("Shyam", 2, 40000);
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s%n", "NAME", "EMPNO", "BASIC" , "DA", "HRA", "GROSS");
        a1.showEmpDetails();
        a2.showEmpDetails();
    }
}
