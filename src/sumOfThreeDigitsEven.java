public class sumOfThreeDigitsEven {
    public static void main(String[] args)
    {
        System.out.println("the sum of three digit even numbers are: ");
        int sum=0;
        for(int i=100;i<999;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
