public class patternSAI 
{
    public static void main (String args[])
    {
        int n=5;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                // if(i==0 || (i>0 && j<=0) || i==(n-1)/2  || (i>n-2 && j>=n-1) || i==n-1)
                // {
                //     System.out.print("* ");
                // }
                // else
                // {
                //     System.out.print("  ");
                // }

                if ((i == 0 || i == n / 2
                || i == n - 1))
                System.out.printf("* ");
            else if (i < n / 2
                    && j == 0)
                System.out.printf("* ");
            else if (i > n / 2
                    && j == n - 1)
                System.out.printf("* ");
            else
                System.out.printf("  ");
            }
            
        
            for(j=0;j<n;j++)
            {
                if((i==0 && j>0 && j<n-1) || (j==0 && i>0) || (j==n-1 && i>0) || i==(n-1)/2)
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
                if(i==0 || i==n-1 || j==(n-1)/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
