import java.awt.*;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n Enter characters: ");
        char c=((input.nextLine()).charAt(0));
        char z= Character.toUpperCase(c);

        switch (z)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(c+" is a vowel.");
                break;
            default:System.out.println(c+" is a consonant.");
        }
    }
}
