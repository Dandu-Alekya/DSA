//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("Enter the first number");
        y = sc.nextInt();
        if(x>y)
        System.out.printf("%d is greater than %d",x,y);
        else if(y>x)
        System.out.printf("%d is greater than %d",y,x);
        else 
        System.out.println("They both are equal");
        sc.close();
    }
}