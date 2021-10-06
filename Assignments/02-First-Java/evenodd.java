//Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your number");
        x=sc.nextInt();
        if(x%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        sc.close();
    }
}
