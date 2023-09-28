public class factorial 
{
    public static void main(String[] args) 
    {
        // int n = 10;
        // fact(10);
        Solution s = new Solution();
        int result = s.fact(10);
        System.out.println(result);
    }   

}
class Solution
{
    int  fact(int n)
    {
            if(n==1)
            {
                return n;
            }
            else
            {
                 return n*fact(n-1);
            }
        
        // System.out.println();
    } 
}
