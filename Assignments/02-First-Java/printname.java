//Take name as input and print a greeting message for that name.
import java.util.Scanner;

public class printname{
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name= sc.nextLine();
        System.out.printf("Hi %s !!",name);
        sc.close();
    }
}