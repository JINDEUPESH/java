//String is Palindrome or not
import java.util.*;
public class AssignmentS 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String st = new String();
        String reverse = "";
        System.out.println("Enter a String:");
        st = in.nextLine();
        char ch[] = st.toCharArray();
        int n = st.length();
        for(int i=n-1;i>=0;i--)
        {
            reverse = reverse+st.charAt(i);
        }
        if(st.equals(reverse))
        {
            System.out.println("\n"+st+" is a Palindrome");
        }
        else
        {
            System.out.println("\n"+st+" is not a palindrome");
        }
    }    
}
