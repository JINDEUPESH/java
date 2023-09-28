
import java.util.*;
public class AssignmentArray2D 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter size of square matrix: ");
        int n = in.nextInt();

        int arr[][] = new int[n][n]; 
        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }
}
