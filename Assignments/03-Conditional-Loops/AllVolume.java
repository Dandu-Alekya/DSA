import java.util.Scanner;

public class AllVolume {
    public static void main(String[] args) {
        double PI=3.14;
        float r,h,b,l;
        Scanner sc = new Scanner(System.in);
        //Volume of Cone
        System.out.println("Enter the radius of the cone");
        r = sc.nextFloat();
        System.out.println("Enter the height of the cone");
        h = sc.nextFloat();
        System.out.printf("The Volume of the cone is: %.2f\n",(PI*Math.pow(r, 2)*h)/3);
        //Volume of Prism
        System.out.println("Enter the legth of the prism");
        r = sc.nextFloat();
        System.out.println("Enter the height of the prism");
        h = sc.nextFloat();
        System.out.printf("The Volume of the prism is: %.2f\n",(PI*Math.pow(r, 2)*h)/3);
        //Volume of Cylinder
        System.out.println("Enter the radius of the cylinder");
        r = sc.nextFloat();
        System.out.println("Enter the height of the cylinder");
        h = sc.nextFloat();
        System.out.printf("The Volume of the cylinder is: %.2f\n",2*PI*r*h);
        //Volume of Sphere
        System.out.println("Enter the radius of the Sphere");
        l = sc.nextFloat();
        System.out.printf("The Volume of the sphere is: %.2f\n",((4/3)*Math.pow(r,3)*PI));
        //Volume of Pyramid
        System.out.println("Enter the base width of the pyramid");
        b = sc.nextFloat();
        System.out.println("Enter the base length of the pyramid");
        l = sc.nextFloat();
        System.out.println("Enter the height of the pyramid");
        h = sc.nextFloat();
        System.out.printf("The Volume of the pyramid is: %.2f\n",(b*l*h)/3);
        sc.close(); 
    }
    
}
