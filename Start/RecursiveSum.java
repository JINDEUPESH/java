
import java.util.*;
class RecursiveSum
{
    public static void main(String[] args) 
    {
        int k =SuperDigit("148",3);
        System.out.println(k);
    }
    public static int SuperDigit(String n,int k)
    {
        String s="";
        for(int i=0;i<k;i++)
        {
            s = s + n;
        }
        int m = Integer.parseInt(s);
        if(m>9)
        {
            int sum = 0;
            while(m>0)
            {
                int a = m%10;
                sum = sum +k;
                m = m/10;
            }
            String h = Integer.toString(sum);
            SuperDigit(h, 1);
        }
        else
        {
            return m;
        }
        return 0;
    }
}