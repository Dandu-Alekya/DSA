import java.util.Scanner;

public class trianglearea {
    public static void main(String[] args) {
        float b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        b = sc.nextFloat();
        System.out.println("Enter the height of the triangle");
        h = sc.nextFloat();
        System.out.println("The area of the triangle is: ");
        System.out.printf("%.2f",0.5*b*h);
        sc.close();
        
    }
    
}
