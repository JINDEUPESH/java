

public class PeakElement 
{
    public static void main(String[] args) 
    {
        int a[]={1,3,2,6,5};//{1,4,7,3,2,6,5}
        int n = a.length;
        int Peak = a[0];
        for(int i=1;i<n-1;i++)
        {
            if(a[i]>a[i-1] && a[i]>a[i+1])
            {
                System.out.println("Peak element = "+a[i]);
                break;
            }
        }
    }    
}
