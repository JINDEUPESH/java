//string class is immutable
//to make it mutable we use stringBuffer Class or StringBuilder class
import java.lang.*;
public class Stringg
{
    public static void main(String[] args) 
    {
       
        StringBuilder s = new StringBuilder("jindeupesh");
        
        for(int i=0;i<s.length();i++)
        {
            // s.substring(i, i+3);
            try
            {
                
            System.out.println(s.substring(i, i+3));
            }
            catch (Exception e) 
            {
                // TODO: handle exception
                // System.out.println("excep");
            }
        }

        String n = "pw";
        int k =4;
        String st = n.repeat(k);
        System.out.println(st);;

    }    
}
