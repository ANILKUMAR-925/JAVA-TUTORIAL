//program to store the account details of n person

package ASSIGNMENT_4;
import java.util.*;
class Account{
    int accNo;
    float balance;
    int timePeriod;
    static float interestRate;
    static{
        interestRate = 7.5f;
    }
    Account(int accNo, float balance,int timePeriod){
        this.accNo = accNo;
        this.balance = balance;
        this.timePeriod = timePeriod;
    }
    float calculateInterest(){
        return (balance*timePeriod*interestRate)/100;
    }
    void showAccDetails(){
        System.out.printf("%-20s %-15s %-15s %-20s%n",accNo,balance,timePeriod,calculateInterest());
    }
    static void changeIntRate(float newRate){
        interestRate = newRate;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of Accounts : ");
        int n = sc.nextInt();
        Account[] a = new Account[n];
        int i;
        for(i=0;i<n;i++){
            System.out.print("enter the account number, balance and time period of " + (i+1) +"th account : ");
            int accNo = sc.nextInt();
            float balance = sc.nextFloat();
            int timePeriod = sc.nextInt();
            a[i] = new Account(accNo,balance,timePeriod);
        }
        System.out.printf("%-20s %-15s %-15s %-20s%n","ACCOUNT NUMBER","BALANCE","TIME PERIOD","INTEREST");
        for(i=0;i<n;i++){
            a[i].showAccDetails();
        }
        System.out.print("enter the interest rate to change : ");
        float newRate = sc.nextFloat();
        Account.changeIntRate(newRate);
        for(i=0;i<n;i++){
            a[i].showAccDetails();
        }
    }
}
