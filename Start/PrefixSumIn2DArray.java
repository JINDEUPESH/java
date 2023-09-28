
import java.util.*;
public class PrefixSumIn2DArray 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = in.nextInt();
        System.out.println("Enter the number of colums : ");
        int cols = in.nextInt();

        int arr[][] = new int[rows][cols];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the first co-ordinates r1 and c1");
        int r1=in.nextInt();
        int c1=in.nextInt();
        System.out.println("Enter the Second coordinates r2 and c2");
        int r2=in.nextInt();
        int c2=in.nextInt();

        int result = prefixSum(arr, r1, c1, r2, c2);
        System.out.println(result);
    }    

    public static int prefixSum(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum = 0; 
        for(int i=r1;i<=c1;i++)
        {
            for(int j=r2;j<=r2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
