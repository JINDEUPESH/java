/*

 * * * * *
 * 
 * * * * *
         *
 * * * * *
 
 */
public class patternS
{
    public static void main (String args[])
    {
        int n=5;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || i==(n-1)/2  || i==n-1 || (i<(n-1)/2 && j==0) ||  (i>(n-1)/2 && j==n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

                // if ((i == 0 || i == (n-1) / 2 || i == n - 1))
                //     System.out.printf("* ");
                // else if (i < n / 2  && j == 0)
                //     System.out.printf("* ");
                // else if (i > n / 2 && j == n - 1)
                //    System.out.printf("* ");
                // else
                //     System.out.printf("  ");
            }
            System.out.println();
        }
    }
}