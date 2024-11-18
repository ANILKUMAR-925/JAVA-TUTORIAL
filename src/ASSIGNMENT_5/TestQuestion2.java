package ASSIGNMENT_5;

class Account{
    String name;
    int accNo;
   Account(String name, int accNo){
       this.name = name;
       this.accNo = accNo;
   }
   void display(){
       System.out.printf("%-20s %-20s%n","name","accNo");
   }
}
class Saving_Account extends Account{
    float min_bal, saving_bal;
    Saving_Account(String name, int accNo, float min_bal, float saving_bal){
        super(name,accNo);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    void show(){
        super.display();
        System.out.printf("%-20s %-20s%n","min_bal","saving_bal");
    }
}

public class TestQuestion2 {

}
