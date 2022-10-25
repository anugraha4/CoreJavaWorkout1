import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        double result;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the limits");
        int l1=s.nextInt();
        int l2=s.nextInt();
        System.out.println("Perfect squares between " + l1 + "and " +l2 + "are");
        for(int i=l1;i<=l2;i++)
        {
            result=Math.sqrt(i);
            if(result==(int)Math.sqrt(i))
            {
                System.out.println(i);
            }
        }
    }
}
