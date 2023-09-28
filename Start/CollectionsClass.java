
import java.util.*;
import java.lang.*;
public class CollectionsClass1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(100);
        al.add(5);
        al.add(250);
        al.add(67);

        Collections.sort(al);
        System.out.println(al);
            
    }
}
