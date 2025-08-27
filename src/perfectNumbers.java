import java.util.*;

public class perfectNumbers {

    public static int isPerfect(int n)
    {
        int sumOfDivisors = 0;
        if( n <= 1)
        {
            return 0;
        }
        for(int i = 1;i<=n/2;i++)
        {
            if(n % i == 0){
                 sumOfDivisors += i;
            }
        }

        if(sumOfDivisors == n)
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        for(int i = 0;i<1000;i++)
        {
            if(isPerfect(i) == 1)
            {
                System.out.println(i);
            }
        }
    }
}
