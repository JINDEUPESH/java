import java.util.*;
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,5,10,11,20};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target element:");
        int target = in.nextInt();

        int result = bsearch(arr, target);
        if(result!=0)
        {
            System.out.println("Element is found at the index "+result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    public static int bsearch(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;   
            }
        }
        return 0;
    }
}
