import java.util.*;
public class Day2
{
    public static void main(String[] args) 
    {
        int a[50];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }

        // Prints each sequential element in array a
        for (int i = 0; i < n ; i++) 
        {
            System.out.println(a[i]);
        }
    }
}