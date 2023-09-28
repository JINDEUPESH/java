import java.util.*;
public class QueueDataStrcture 
{
    public static void main(String[] args) 
    {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        
        System.out.println(q.remove());

        System.out.println(q.peek());

        q.offer(60);

        System.out.println(q);

        q.poll();

        System.out.println(q);
    }
    
    
}
