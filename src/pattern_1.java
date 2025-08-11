import java.util.*;
//to print the pattern: 1,2,4,7,11,16,22,29...nth
public class pattern_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); //nth term
        int a = sc.nextInt();

        for(int i = 1;i<=a;i++)
        {
            System.out.print(a+" ");
            a=a+i;
        }
    }

}
