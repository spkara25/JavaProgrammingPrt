import java.util.Scanner;

public class salaryPay {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float basicpay, dearAllow, PF, house, netpay;
        System.out.println("Enter basic pay bro: ");
        basicpay=sc.nextFloat();
        dearAllow=(float) 25*basicpay/100;
        PF = (float) 8.33*basicpay/100;
        house=(float)15*basicpay/100;
        netpay=basicpay+dearAllow+PF+house;
        System.out.println("The net pay for ur salary is: ");
        System.out.println(netpay);
    }
}
