import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit:");
        double fahrenheit=input.nextDouble();

        double celsius=((5*(fahrenheit-32.0))/9.0);
        System.out.println(celsius+" in Celsius");
    }
}
