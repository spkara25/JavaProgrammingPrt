import java.util.*;

public class rotateMatrix90 {
    public static void transposeArr(int arr[][])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i + 1 ; j<n ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseEachRow(int arr[][])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            int start = 0, end = n-1;
            while(start < end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        transposeArr(arr);
        reverseEachRow(arr);

        System.out.println("new array");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
