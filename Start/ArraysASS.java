// import java.util.*;
public class ArraysASS 
{
    public static void main(String[] args) 
    {
        int arr[]={5,6,1,3,2};//do not include zero.
        int n = arr.length;
        palindrome(arr, n);
        reverse(arr, n);
        missingNumber(arr, n);

        int ar[] = {1,2,3,3,5};
        int m = arr.length;
        duplicate(ar,m);
    }
    static void palindrome(int arr[],int n)
    {
        int i,flag=0;
        for(i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                flag=1;
                System.out.println("Not  palindrome array.");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome array.");
        }
    }
    static void reverse(int arr[],int n)
    {
        int i;
        System.out.println("Reverse of array is : ");
        for(i=n-1;i>0;i--)
        {
            System.out.println(arr[i]+"\t");
        }
    }
    static void missingNumber(int arr[],int n)
    {
        int sum1 = (n+1)*(n+2)/2; // because 1 element is missing so we are adding one element.
        int sum2 = 0;
        for(int i=0;i<n;i++)
        {
            sum2 = sum2+arr[i];     //sum of array elements
        }
        int missing_num = sum1-sum2;
        System.out.println("Missing Number : "+missing_num); 
    }
    static void duplicate(int arr[],int n)
    {
        //sort
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int i,j;
        int flag=0;
        for( i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    // System.out.println("Duplicate element : "+arr[i]);
                    flag=1;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Duplicate element :"+arr[i]);
        }
        else
        {
            System.out.println("no duplicate elements");
        }
    }
}
