
import java.util.Scanner;

public class Array2D 
{
    public static void main(String[] args) 
    {
        // Scanner in =new Scanner(System.in);
        // System.out.println("enter size of square matrix: ");
        // int n = in.nextInt();

        // int arr[][] = new int[n][n]; 
        // System.out.println("Enter matrix elements:");
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         arr[i][j]=in.nextInt();
        //     }
        // }
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i+j<n-1)
        //         {
        //             System.out.print(arr[i][j]+"\t");
        //         }
        //     }
        // }

        //to interchange colums form last to first that is if it has 4 colums 4-1 and 3-2

        // System.out.println("***************************");
        // for(int i=0;i<n;i++)
        // {
        //     int low=0,high=n-1;
        //     while(low<high)
        //     {
                
        //         int temp = arr[i][low];
        //         arr[i][low]= arr[i][high];
        //         arr[i][high] = temp;
                
        //         System.out.print(arr[i][low]+"\t");
        //     }
        //     System.out.println();
        // }

        int arr[][]={{1,1,0,0},
                     {1,0,0,1},
                     {0,1,1,1},
                     {1,0,1,0}};
        int i,j,low=0,high=arr.length;
        // for(i=0;i<arr.length;i++)
        // {
        //     while(low<high)
        //     {
        //         int temp = arr[i][low];
        //         arr[i][low] = arr[i][high];
        //         arr[i][high] = temp;
        //         low++;
        //         high--;
        //     }
        // }

        int c =arr.length;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<(arr[i].length)/2;j++)
            {
                int temp = arr[i][j];
                arr[i][j]= arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1] = temp;
            }
        }
  
         printMatrix(arr);
    }
    public static void printMatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
