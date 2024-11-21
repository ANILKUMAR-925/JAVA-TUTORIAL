package ASSIGNMENT_5;
import java.util.*;

class Account{
    String name;
    int accNo;
    Account(String name, int accNo){
        this.name = name;
        this.accNo = accNo;
    }
    void display(){
        System.out.print(name + "     " + accNo +"     ");
    }
}
class Saving_Account extends Account{
    int min_bal, saving_bal;
    Saving_Account(String name, int accNo, int min_bal, int saving_bal){
        super(name, accNo);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    void show(){
         super.display();
        System.out.print(min_bal + "     " + saving_bal + "     ");
    }
}
class Account_details extends Saving_Account{
    int deposit, withdrawl;
    Account_details(String name, int accNo, int min_bal, int saving_bal, int deposit, int withdrawl){
        super(name, accNo, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }
    void show1(){
        super.show();
        System.out.println(deposit + "     " + withdrawl);
    }
}
public class TestQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter name, account number, minimum balance, saving balance, deposit, and withdrawl : ");
        String name = sc.next();
        int accNo = sc.nextInt();
        int min_balance = sc.nextInt();
        int saving_balance  = sc.nextInt();
        int deposit = sc.nextInt();
        int withdrawl = sc.nextInt();
        Account_details a = new Account_details(name, accNo, min_balance, saving_balance, deposit, withdrawl);
        System.out.println("account details are : ");
        a.show1();
    }
}
