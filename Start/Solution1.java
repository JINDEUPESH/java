
import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> l = new ArrayList<>();
        String query;
        int index,element;
        Scanner in = new Scanner(System.in);
        Iterator it = l.iterator();
        int n = in.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.print("enter "+i+":");
            l.add(in.nextInt());
        }
        
        int temp = in.nextInt();//no of opearations
        for(int i=0;i<temp;i++)
        {
         System.out.println("Enter query:");
         query=in.next();
         switch(query)
         {
             case "Insert":
                index = in.nextInt();
                element = in.nextInt();
                l.add(index, element);
                break;
             case "Delete":
                index = in.nextInt();
                l.remove(index);  
                break;   
         }
        }
        // System.out.println(l);
      for(int i=0;i<l.size();i++)
      {
        System.out.print(l.get(i));
      }
        
    }
}
