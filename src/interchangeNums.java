import java.util.Scanner;

public class interchangeNums {
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The non-swapped numbers are: ");
        System.out.printf("%d %d", a, b);
        System.out.printf("\n");
        temp = a; //temp = 5
        a = b; //a = 10
        b = temp; // b= 5;
        System.out.println("The swapped characters are: ");
        System.out.printf("%d %d", a, b);

    }
}
