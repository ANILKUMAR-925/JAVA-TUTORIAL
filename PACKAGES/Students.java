package btech;

public class Students{
    int rollNo;
    String name;
    int sub1, sub2, sub3;

    public Students(int rollNo, String name, int sub1, int sub2, int sub3) {
        this.rollNo = rollNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public void display(){
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("----------MARKS----------");
        System.out.println("Sub1: "+ sub1);
        System.out.println("Sub2 : "+ sub2);
        System.out.println("Sub3 : "+ sub3);
        System.out.println("Total : "+ (sub1+sub2+sub3));
        System.out.println("Percentage : "+ ((sub1+sub2+sub3)*100)/300);
    }
}