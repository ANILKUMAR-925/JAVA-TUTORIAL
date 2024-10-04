//question number 5 of assignment 5

package ASSIGNMENT_4;
import java.util.*;
class Employee{
    private String empName;
    private String empNo;
    private int dependentCnt;
    Employee(String name, String eno, int depCnt){
        empName = name;
        empNo = eno;
        dependentCnt = depCnt;
    }
    void showEmpDetails(){

        System.out.printf("%-15s %-20s %-20s%n", empName, empNo,depCount());
    }
    int depCount(){
        return dependentCnt;
    }
}
public class EmpTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees : ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("enter the name, employee number and dependent count of " + (i+1) + "th employee : ");
            String name = sc.next();
            String empNo = sc.next();
            int depCnt = sc.nextInt();
            e[i] = new Employee(name,empNo,depCnt);
        }
        System.out.printf("%-15s %-20s %-20S%n","NAME","EMPLOYEE NUMBER","DEPENDENT COUNT");
        for(i=0;i<n;i++){
            e[i].showEmpDetails();
        }
    }
}
