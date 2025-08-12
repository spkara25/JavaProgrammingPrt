import java.util.*;

public class pat1question {
    //check if a number is palindrome or perfect or both

    public static boolean isPalin(int num)
    {
        int temp = num;
        int digit;
        int reverse = 0;

        while(temp > 0)
        {
            digit = temp % 10;
            reverse+= digit*10;
            temp /=10;
        }

        if(reverse == num)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPerfect(int num)
    {
        int sumOfDivisors = 0;
        int temp = num;
        for(int i = temp-1;i>0;i--)
        {
            if(temp % i == 0)
            {
                sumOfDivisors += i;
            }
        }

        if(sumOfDivisors == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(isPalin(num))
        {
            if(isPerfect(num))
            {
                System.out.println("both");
            }
            else
            {
                System.out.println("palindrome only");
            }
        }
        else
        {
            if(isPerfect(num))
            {
                System.out.println("perfect");
            }
            else {
                System.out.println("neither of them");
            }
        }

        sc.close();
    }
}
