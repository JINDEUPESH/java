import java.io.*;
class Subset 
{
    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[], int n, int d)
    {
        // Base Cases
        if (d == 0)
            return true;
        if (n == 0)
            return false;
 
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > d)
            return isSubsetSum(set, n - 1, d);
 
        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, d)
            || isSubsetSum(set, n - 1, d - set[n - 1]);
    }
 
    /* Driver code */
    public static void main(String args[])
    {
        int set[] = { 1, 2, 5, 6, 8 };
        int d = 9;
        int n = set.length;
        if (isSubsetSum(set, n, d) == true)
            System.out.println("Found a subset"  + " with given d");
        else
            System.out.println("No subset with"   + " given d");
    }
}
