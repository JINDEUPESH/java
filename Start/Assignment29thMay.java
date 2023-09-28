

import java.util.Scanner;
public class Assignment29thMay 
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array elements are:");
      
        for(int i=0;i<n;i++)
        {
                System.out.println(arr[i]);
        }
    }
}
