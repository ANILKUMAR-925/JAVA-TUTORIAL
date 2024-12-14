package EXCEPTION_HANDLING;
import java.util.*;

class MinimumBalanceException extends Exception{
    MinimumBalanceException(String e){
        super(e);
    }
}
class Account{
    String name;
    int accNo;
    double balance;
    Account(String name, int accNo, double balance){
        this.name =name;
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(int amt){
        balance+=amt;
        System.out.println("total available balance is : " + balance);
    }
    void withdraw(int amt)throws MinimumBalanceException{
        if (balance<=500){
            throw new MinimumBalanceException("minimum balance so you can not withdraw money");
        }
        else{
            balance-=amt;
            System.out.println("total available balance is : " + balance);
        }
    }
    void transfer(Account acc1, Account acc2, int amt)throws MinimumBalanceException{
        if(acc1.balance<=500){
            throw new MinimumBalanceException("minimum balance so you can not transfer money");
        }
        else{
            acc1.balance-=amt;
            acc2.balance+=amt;
            System.out.println("available balance of account-1 : " + acc1.balance);
            System.out.println("available balance of account-2 : " + acc2.balance);
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Account[] acc = new Account[2];
        int i;
        for(i=0;i<2;i++){
            System.out.println("enter name, account number and balance : ");
            String name = sc.next();
            int accNo = sc.nextInt();
            double balance = sc.nextDouble();
            acc[i] = new Account(name,accNo,balance);
        }
        System.out.println("enter the amount to deposit : ");
        int amt = sc.nextInt();
        acc[0].deposit(amt);
        System.out.println("enter the amount to withdraw : ");
        amt = sc.nextInt();
        try{
            acc[0].withdraw(amt);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("enter the amount to transfer : ");
        amt = sc.nextInt();
        try{
            acc[0].transfer(acc[0],acc[1],amt);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
