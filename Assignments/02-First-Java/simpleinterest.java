//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        float principal, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pricipal amount");
        principal = sc.nextFloat();
        System.out.println("Enter the interest rate");
        rate = sc.nextFloat();
        System.out.println("Enter the time span in years");
        time = sc.nextFloat();
        float SI;
        SI= ((principal*time*rate)/100);
        System.out.printf("The simple interest for the %.2f amount at %.2f rate in %.2f years is: %.2f",principal,rate,time,SI);
        sc.close();
    }
    
}
