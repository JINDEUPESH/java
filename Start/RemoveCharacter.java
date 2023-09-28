
import java.lang.*;
public class RemoveCharacter 
{
    public static void main(String[] args) 
    {
        String st = "PWSKILLS JAVA";
        System.out.println(removechar(st,3));
    }
    static String removechar(String str,int pos)
    {
        return str.substring(0, pos)+str.substring(pos+1);
    }
}
