// You are using Java
import java.util.*;

public class matrixMul
{
    public static int[][] calcSum(int arr1[][], int arr2[][], int r, int c)
    {
        int sum[][] = new int[r][c];

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[r][c];
        result = calcSum(matrix1, matrix2, r, c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}