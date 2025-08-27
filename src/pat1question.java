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
            reverse = reverse*10 + digit;
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
        int[] both = new int[100];
        int[] palin = new int[100];
        int[] perfect = new int[100];
        int[] none = new int[100];

        for(int i =0;i<100;i++)
        {
            if(isPalin(i))
            {
                if(isPerfect(i))
                {
                    System.out.println(i+" both");
                }
                else
                {
                    System.out.println(i+ " palindrome only");
                }
            }
            else
            {
                if(isPerfect(i))
                {
                    System.out.println(i+" perfect");
                }
                else {
                    System.out.println(i+" neither of them");
                }
            }
        }



        sc.close();
    }
}
