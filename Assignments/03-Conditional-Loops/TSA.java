import java.util.Scanner;

public class TSA {
    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        //Q.20 Total Surface Area Of Cube
        System.out.println("Enter the side of the sqaure");
        a = sc.nextFloat();
        System.out.printf("The TSA of the Square is: %.2f\n",6*Math.pow(a,2));
        sc.close();
        
    }
    
}
