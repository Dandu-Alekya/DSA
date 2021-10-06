import java.util.Scanner;

//Input currency in rupees and output in USD.
public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount;
        System.out.println("Enter your amount in rupees");
        amount= sc.nextFloat();
        System.out.printf("Your amount %.2f in USD is: %.2f",amount, amount*0.013);
        sc.close();
        
    }
    
}
