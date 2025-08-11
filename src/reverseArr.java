// You are using Java
import java.util.*;
public class reverseArr
{
    public static void reversearr(int[] arr,int start, int end) // reverse a sub array
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        k= k % n;

        System.out.println("The original array is: ");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        reversearr(arr, 0, n-1);
        reversearr(arr, 0, k-1);
        reversearr(arr, k, n-1);

        System.out.println("After rotation");
        for(int i : arr)
        {
            System.out.print(i +" ");
        }
    }
}