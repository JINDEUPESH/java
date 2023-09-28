


class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadProgram 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        t1.start();
        
    }    
}
