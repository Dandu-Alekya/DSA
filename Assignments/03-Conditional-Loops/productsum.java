import java.util.Scanner;
//Subtract the Product and Sum of Digits of an Integer
public class productsum {
    public static void main(String[] args) {
        int num,sum=0,product=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        while(num>0){
            int x=num%10;
            sum+=x;
            product*=x;
            num=num/10;
        }
        System.out.printf("The result of Subtracting the Product and Sum of Digits of the given number is: %d",Math.abs(sum-product));
        sc.close();
    }
    
}
