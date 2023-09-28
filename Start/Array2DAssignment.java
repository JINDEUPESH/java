
import java.util.*;
public class Array2DAssignment 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the no of rows of 2D array:");    
        int ro = in.nextInt();
        
        System.out.println("Enter the no of Colums of 2D array: ");
        int col = in.nextInt();

        int arr[][] = new int[ro][col]; 

        for(int i=0;i<ro;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        int count1=0,count2=0,count3=0,count4=0,count5=0;
        for(int i=0;i<ro;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]>0)
                {
                    count1++;
                }
                if(arr[i][j]<0)
                {
                    count2++;
                }
                if(arr[i][j]%2==0)
                {
                    count3++;
                }
                else
                {
                    count4++;
                }
                if(arr[i][j]==0)
                {
                    count5++;
                }
            }
        }
        System.out.println("Number of Positive numbers:"+count1);
        System.out.println("Number of Negative numbers:"+count2);
        System.out.println("Number of Odd numbers:"+count4);
        System.out.println("Number of even numbers:"+count3);
        System.out.println("Number of Zero numbers:"+count5);
        
    }
}
