//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class LargestofAll {
    public static void main(String[] args) {
        int largest=0,x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers for the largest number. Input 0 to see the largest");
        while(x!=0){
            x=sc.nextInt();
            if(x>largest)
                largest=x;
        }
        System.out.println("Largest= "+ largest);
        sc.close();
        
    }
    
}
