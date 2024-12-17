//sort an array of names
package STRING;

public class Question3 {
    public static void main(String[] args) {
        String[] names = {"Ram", "John", "Harish", "Anand", "Ajay"};
        int i,j,k;
        for(i=0; i< names.length-1; i++){
            for(j=0; j< names.length-i-1; j++){
                k = 0;
                if(names[j].charAt(k) > names[j+1].charAt(k)){
                    String temp = "";
                    temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
                else if(names[j].charAt(k) == names[j+1].charAt(k)){
                    k++;
                    while(names[j].charAt(k) == names[j+1].charAt(k)){
                        k++;
                    }
                    if(names[j].charAt(k) > names[j+1].charAt(k)){
                        String temp = "";
                        temp = names[j];
                        names[j] = names[j+1];
                        names[j+1] = temp;
                    }
                }
            }
        }
        System.out.println("names after sorting : ");
        for (i=0; i<names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}
