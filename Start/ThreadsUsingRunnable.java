
import java.util.*;
class Calc implements Runnable
{
    public void run()
    {

        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number:");
        a=in.nextInt();
        System.out.println("Please enter Second");
        b=in.nextInt();
        System.out.println(a*b);
    }
}

public class ThreadsUsingRunnable 
{
    
}
