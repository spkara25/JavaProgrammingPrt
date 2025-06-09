public class first10odd {
    public static void main(String[] args)
    {
        int i, s=0;
        for (i=0;i<20;i++)
        {
            if(i%2!=0)
            {
                s+=i;
            }
        }

        System.out.print("The sum of odd numbers: ");
        System.out.print(s);
    }
}
