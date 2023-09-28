import java.util.*;
//Binary search concept
public class FirstOcuurence 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array Size:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("enter target element:");
        int target = in.nextInt();

        int result = firstOccurence(arr,target);
        if(result!=-1)
        {
            System.out.println("First occurence of element "+target+" is at index :"+result);
        }
        else
        {
            System.out.println("Element not found");
        }

    }
    public static int firstOccurence(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                result = mid;
                //we want lower bound of an element,so we need to traverse left side of an array
                high = mid-1;
            }
            else if(arr[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return result;
    }
}
