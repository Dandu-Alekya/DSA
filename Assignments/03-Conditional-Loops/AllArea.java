import java.util.Scanner;

public class AllArea {
    public static void main(String[] args) {
        float r,l,b,h,p,q,a;
        Scanner sc = new Scanner(System.in);
        //Area of Circle
        System.out.println("Enter the radius of the circle");
        r= sc.nextFloat();
        System.out.printf("The area of the circle is: %.2f\n",r*r*3.14);
        //Area of Triangle
        System.out.println("Enter the base of the triangle");
        b = sc.nextFloat();
        System.out.println("Enter the height of the triangle");
        h = sc.nextFloat();
        System.out.printf("The area of the triangle is: %.2f\n",0.5*b*h);
        //Area of Rectangle
        System.out.println("Enter the length of the rectange");
        l = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle");
        b = sc.nextFloat();
        System.out.printf("The area of the rectangle is: %.2f\n",l*b);
        //Area of Isosceles Triangle
        System.out.println("Enter the base of the Isosceles triangle");
        b = sc.nextFloat();
        System.out.println("Enter the height of the Isosceles triangle");
        h = sc.nextFloat();
        System.out.printf("The area of the Isosceles triangle is: %.2f\n",0.5*b*h);
        //Area of Parallelogram
        System.out.println("Enter the base of the parallelogram");
        b = sc.nextFloat();
        System.out.println("Enter the height of the parallelogram");
        h = sc.nextFloat();
        System.out.printf("The area of the parallelogram is: %.2f\n",b*h);
        //Area of Rhombus
        System.out.println("Enter the diagonal 1 of the rhombus");
        p = sc.nextFloat();
        System.out.println("Enter the diagonal 2 of the rhombus");
        q = sc.nextFloat();
        System.out.printf("The area of the Isosceles triangle is: %.2f\n",0.5*p*q);
        //Area of Equilateral Triangle
        System.out.println("Enter the side of the equilateral triangle");
        a = sc.nextFloat();
        System.out.printf("The area of the Equlilateral triangle is: %.2f\n",((Math.sqrt(3)/4)*Math.pow(a, 2)));
        sc.close(); 
    }
    
    
}
