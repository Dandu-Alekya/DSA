import java.util.Scanner;

/* Java Basic Questions 8-13*/

public class AllPerimeter {
    public static void main(String[] args) {
        float r,l,b,h,a;
        Scanner sc = new Scanner(System.in);
        //Perimeter of Circle
        System.out.println("Enter the radius of the circle");
        r= sc.nextFloat();
        System.out.printf("The Perimeter of the circle is: %.2f\n",2*r*r*3.14);
        //Perimeter of Equilateral Triangle
        System.out.println("Enter the side of the equilateral triangle");
        a = sc.nextFloat();
        System.out.printf("The Perimeter of the Equlilateral triangle is: %.2f\n",3*a);
        //Perimeter of Parallelogram
        System.out.println("Enter the base of the parallelogram");
        b = sc.nextFloat();
        System.out.println("Enter the height of the parallelogram");
        h = sc.nextFloat();
        System.out.printf("The Perimeter of the parallelogram is: %.2f\n",2*b*h);
        //Perimeter of Rectangle
        System.out.println("Enter the length of the rectange");
        l = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle");
        b = sc.nextFloat();
        System.out.printf("The Perimeter of the rectangle is: %.2f\n",2*(l+b));
        //Perimeter of Square
        System.out.println("Enter the side of the sqaure");
        a = sc.nextFloat();
        System.out.printf("The Perimeter of the Square is: %.2f\n",4*a);
        //Perimeter of Rhombus
        System.out.println("Enter the length of side of the rhombus");
        a = sc.nextFloat();
        System.out.printf("The Perimeter of the Isosceles triangle is: %.2f\n",4*a);
        sc.close(); 
    }
    
}
