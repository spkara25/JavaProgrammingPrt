import java.util.Scanner;
//Math class is in java.lang package, no need to import explicitly
public class pwrOfTwo {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        double c = Math.pow(a,2.0);
        double d = Math.pow(b,2.0);
        System.out.println("The square of the number is: ");
        System.out.printf("%f %f",c,d);

    }
}
