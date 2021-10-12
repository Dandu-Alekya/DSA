//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if(x%i==0)
                System.out.println(i+" ");
        }
        sc.close();
    }
    
}
