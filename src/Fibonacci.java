import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int terms,i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        terms=input.nextInt();

        for(i=0;i<terms;i++)
        {
            System.out.println(fibonacci(i)+"");
        }
    }

    public static int fibonacci(int num)
    {
        if(num <2)
            return num;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
