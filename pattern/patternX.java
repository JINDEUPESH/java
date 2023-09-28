public class patternX 
{
/*

 *       *
   *   *    
     *    
   *   *  
 *       *
 
 */

    public static void main(String args[])
    {
        int n=5;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n-1 || i==j)
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

