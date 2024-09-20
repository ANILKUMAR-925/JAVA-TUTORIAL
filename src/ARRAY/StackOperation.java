//program to perform all the operation of stack

package ARRAY;
import java.util.*;

class Stack{
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int top;
    Stack(){
        top = -1;
    }
    boolean isFull(){
        if(top == 9){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    void push(){
        System.out.print("enter the element you want to push : ");
        arr[++top] = sc.nextInt();
    }
    int pop(){
        return arr[top--];
    }
    void display(){
        int i;
        for(i=top; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        boolean check = true;
        do{
            System.out.println("enter 1 to PUSH : ");
            System.out.println("enter 2 to POP : ");
            System.out.println("enter 3 to DISPLAY : ");
            System.out.print("enter other key to EXIT : ");
            int op = sc.nextInt();
            System.out.println();
            switch(op) {
                case 1:
                    if (s.isFull())
                        System.out.println("stack overflow");
                    else
                        s.push();
                    break;
                case 2:
                    if (s.isEmpty())
                        System.out.println("stack underflow");
                    else
                        System.out.println("popped element is " + s.pop());
                    break;
                case 3:
                    if (s.isEmpty())
                        System.out.println("stack underflow");
                    else{
                        System.out.println("stack elements are : ");
                        s.display();
                    }
                    break;
                default:
                    check = false;
            }
            System.out.println();
        }while(check);
    }
}
