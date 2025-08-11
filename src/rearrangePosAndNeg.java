import java.util.*;

public class rearrangePosAndNeg {
    public static void rightRotate(int arr[], int start, int end)
    {
        int temp = arr[end];
        for(int i = end;i>start; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[start] = temp;
    }

    public static void rearrange(int arr[]) {
        int n = arr.length;
        int wrongIndex = -1;
        for (int i = 0; i < n; i++)
        {
            if(wrongIndex != -1)
            {
                if((arr[wrongIndex] >= 0 && arr[i] < 0) || (arr[wrongIndex] < 0 && arr[i] >= 0))
                {
                    rightRotate(arr, wrongIndex, i);

                    if(i - wrongIndex >=2)
                    {
                        wrongIndex += 2;
                    }
                    else {
                        wrongIndex = -1;
                    }
                }
            }

            else {
                if(((arr[i] >=0) && ( i% 2 == 1)) || ((arr[i] <0) && ( i %2 == 0)))
                {
                    wrongIndex = i;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " +Arrays.toString(arr));
        rearrange(arr);
        System.out.println("Rearranged array: "+ Arrays.toString(arr));
    }
}
