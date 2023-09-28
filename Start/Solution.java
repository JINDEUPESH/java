import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        int a[50];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}