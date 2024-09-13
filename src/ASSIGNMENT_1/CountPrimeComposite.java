//count the number of prime and composite numbers between m and n

package ASSIGNMENT_1;
import java.util.*;
public class CountPrimeComposite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of m : ");
        int m = sc.nextInt();
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        if(m > n){
            System.out.println("m should be grater than n");
        }
        else{
            int i, j;
            int primeCount = 0 , compCount = 0;
            for(i = m; i <= n; i++){
                if(i == 0 || i == 1){
                    compCount++;
                }
                else if(i == 2){
                    primeCount++;
                }
                else{
                    boolean check = true;
                    for(j=2; j<=i/2+1; j++){
                        if(i%j == 0){
                            check = !check;
                            compCount++;
                            break;
                        }
                    }
                    if(check){
                        primeCount++;
                    }
                }
            }
            System.out.println("total number of prime number between " + m + " and " + n + " is " + primeCount);
            System.out.println("total number of composite number between " + m + " and " + n + " is " + compCount);
        }
    }
}
