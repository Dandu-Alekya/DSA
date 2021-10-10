import java.util.Scanner;

public class CSA {
    public static void main(String[] args) {
        float r,h;
        double PI=3.14;
        Scanner sc = new Scanner(System.in);
        //Curved Surface Area of Cylinder
        System.out.println("Enter the radius of the cylinder");
        r = sc.nextFloat();
        System.out.println("Enter the height of the cylinder");
        h = sc.nextFloat();
        System.out.printf("The Volume of the cylinder is: %.2f\n",2*PI*r*h);
        sc.close();
        
    }
    
}
