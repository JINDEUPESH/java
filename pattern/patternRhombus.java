
public class patternRhombus 
{ 
    public static void main(String args[])
    {
        int n=5;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i+j>=(n-1)/2  && i+j<=(n-1) && i<=(n-1)/2 && j<=(n-1)/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                } 
            }
            for(j=0;j<n;j++)
            {
                
            }
            System.out.println();
        }
    }
}
