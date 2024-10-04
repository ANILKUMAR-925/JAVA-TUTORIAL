//program to show the details of the employees in a tabular form

package ASSIGNMENT_4;

class Employees{
    String empName;
    int empNo;
    float basicSalary, da, hra, grossSalary;
    Employees(String empName, int empNo, float basicSalary){
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
        Employees a1 = new Employees("Ram", 1, 50000);
        Employees a2 = new Employees("Shyam", 2, 40000);
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s%n", "NAME", "EMPNO", "BASIC" , "DA", "HRA", "GROSS");
        a1.showEmpDetails();
        a2.showEmpDetails();
    }
}
