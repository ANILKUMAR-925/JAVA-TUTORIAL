package ASSIGNMENT_5;
import java.util.*;

class Bank{
    float interestRate;
    void getRateOfInterest(){
        System.out.println("Rate Of Interest : " + interestRate);
    }
}
class SBI extends Bank{
    SBI(){
        interestRate = 8;
    }
    void getRateOfInterest(){
        System.out.println("SBI Rate Of Interest : " + interestRate);
    }
}
class ICICI extends Bank{
    ICICI(){
        interestRate = 7;
    }
    void getRateOfInterest(){
        System.out.println("ICICI Rate Of Interest : " + interestRate);
    }
}
class AXIS extends Bank{
    AXIS(){
        interestRate = 9;
    }
    void getRateOfInterest(){
        System.out.println("AXIS Rate Of Interest : " + interestRate);
    }
}
public class Question8 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        s.getRateOfInterest();
        i.getRateOfInterest();
        a.getRateOfInterest();
    }
}
