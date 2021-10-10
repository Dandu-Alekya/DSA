import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci series");
        n= sc.nextInt();
        a=0;
        b=1;
        System.out.println("The Fibonacci series is: ");
        System.out.printf("%d %d ",a,b);
        while(n>0){
            c=a+b;
            System.out.printf("%d ",c);
            a=b;
            b=c;
            n--;
        }
        sc.close();
        
    }
    
}
