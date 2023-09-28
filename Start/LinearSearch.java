import java.util.*;
public class LinearSearch 
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a[] = {1,10,2,89,5,6};
        int n = a.length;
        System.out.println("enter the element you want to search:");
        int element = in.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==element)
            {
                flag=i;
            }
        }
        if(flag==-1)
        {
            System.out.println("element "+element+" is not found");
        }
        else
        {
            System.out.println("element "+element+" found at location"+flag);
        }
    }    
}
