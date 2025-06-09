import java.util.*;
public class FactorialNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=a;i>=1;i--)
        {
           fact*=i;
        }

        System.out.print("the factorial: ");
        System.out.print(fact);
    }
}
