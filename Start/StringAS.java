
import java.util.*;
public class StringAS 
{
    public static void main(String[] args) 
    {
        String s="Hello, have a good day";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                System.out.print(ch[i]);
            }
            else
            {
                continue;
            }
        }
    }
}
