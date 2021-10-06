//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        float num1,num2;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1= sc.nextFloat();
        System.out.println("Enter the second number");
        num2= sc.nextFloat();
        System.out.println("Enter the operator(* + - / %)");
        operator= sc.next();
        
        if(operator.charAt(0)=='*')
        System.out.printf("The ans of %.2f %s %.2f is %.2f ",num1,operator,num2, num1*num2);
        else if(operator.charAt(0)=='+')
        System.out.printf("The ans of %.2f %s %.2f is %.2f ",num1,operator,num2, num1+num2);
        else if(operator.charAt(0)=='-')
        System.out.printf("The ans of %.2f %s %.2f is %.2f ",num1,operator,num2, num1-num2);
        else if(operator.charAt(0)=='/')
        System.out.printf("The ans of %.2f %s %.2f is %.2f ",num1,operator,num2, num1/num2);
        else if(operator.charAt(0)=='%')
        System.out.printf("The ans of %.2f %s %.2f is %.2f ",num1,operator,num2, num1%num2);
        else 
        System.out.printf("Wrong Operator");
        sc.close();
        
    }
    
}
