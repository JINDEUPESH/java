 import java.util.Scanner;
public class Substringccompare 
{
    public static String getSmallestAndLargest(String s, int k) 
    {
        String smallest =s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i=1;i<=s.length()-k;i++)
        {
            String substring=s.substring(i, i+k);
            if(substring.compareTo(smallest)<0)//you need to compare the substring to smallest
            {
                smallest=substring;
            }
           if(substring.compareTo(largest)>0)////you need to compare the substring to largest
            {
                largest=substring;
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
    

