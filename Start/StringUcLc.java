
import java.lang.*;
import java.util.*;
public class StringUcLc 
{
    public static void main(String[] args) 
    {
        String s = "upeshjinde";
        sortString(s);
    }
    static void sortString(String str) 
    {
        char []ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.print(String.valueOf(ch));
    }
}
