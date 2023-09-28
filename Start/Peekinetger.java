// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Peekinetger 
{
    public static void main(String[] args) 
    {
        int i,n,j,temp=0,flag=0;
        System.out.println("enter array size");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("enter array elements");
        for(i=0;i<n;i++)
        {
            a[i]= in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j-1]<a[j] && a[j]>a[j+1])
                {
                        // System.out.println("peek integer = "+a[j]);
                        flag = 1;
                        temp = a[j];
                }
            }
        }
          if(flag==1)
            {
                System.out.println("peek integer = "+temp);
            }
            else
            {
                System.out.println(" no peek integer found");
            }
    }
}