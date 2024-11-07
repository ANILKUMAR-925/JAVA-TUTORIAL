//program to store the details of employees (Q-10)

package ASSIGNMENT_4;
import java.util.*;
class  Employee_s{
    String empName;
    int empNo;
    float basicSal,da,hra,grossSal;
    Employee_s(String name, int empNo, float basicSal){
        this.empName = name;
        this.empNo = empNo;
        this.basicSal = basicSal;
        da = (basicSal*30)/100;
        hra = (basicSal*20)/100;
    }
    void calGrossSal(){
        grossSal = basicSal+da+hra;
    }
    void showEmpDetails(){
        calGrossSal();
        System.out.printf("%-15s %-10s %-15s %-15s %-15s %-20s%n",empName,empNo,basicSal,da,hra,grossSal);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Employee_s[] e = new Employee_s[2];
        int i;
        for(i=0;i<2;i++){
            System.out.print("enter the name, employee number and basic salary of "+ (i+1) + "th employee : ");
            String name = sc.next();
            int empNo = sc.nextInt();
            float basicSal = sc.nextFloat();
            e[i] = new Employee_s(name,empNo,basicSal);
        }
        System.out.printf("%-15s %-10s %-15s %-15s %-15s %-20s%n","NAME","NUMBER","BASIC","DA","HRA","GROSS");
        for(i=0;i<2;i++){
            e[i].showEmpDetails();
        }
    }
}
