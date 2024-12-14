// print monday to sunday in reverse order
package STRING;

public class Question1 {
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String[] str = days.split(" ");
        int i;
        for(i=str.length-1; i>=0; i--){
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
}
