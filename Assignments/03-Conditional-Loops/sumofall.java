//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;

public class sumofall {
    public static void main(String[] args) {
        int sum=0,x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers for the total sum. Input 0 to see the sum");
        while(x!=0){
            x=sc.nextInt();
            sum=sum+x;
        }
        System.out.println("sum= "+ sum);
        sc.close();
        
    }
    
}
