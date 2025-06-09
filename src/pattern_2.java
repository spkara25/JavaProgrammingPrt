import java.util.*;
//to print the pattern- 2,4,8,14,22....
public class pattern_2 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end number: ");
        n = sc.nextInt();
        int p=2, c=2;
        for(int i = 1;i<=n;i++)
        {
            System.out.print(p+" ");
            p+=c;
            c+=2;
        }
    }
}
