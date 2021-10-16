import java.util.Scanner;

public class vowelorconsonant {
    public static void main(String[] args) {
        char letter;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your letter");
        String word=sc.next();
        word= word.toLowerCase();
        letter=word.charAt(0);
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
            System.out.println("The letter "+letter+" is a vowel");
        else
        System.out.println("The letter "+letter+" is a consonant");
        sc.close();        
    }
    
}
