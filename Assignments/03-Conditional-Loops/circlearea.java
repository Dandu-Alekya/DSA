import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        float r;
        double PI= 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r= sc.nextFloat();
        System.out.println("The area of the circle is: ");
        System.out.printf("%.2f",r*r*PI);
        sc.close();
    }
}