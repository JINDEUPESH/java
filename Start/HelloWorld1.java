// public class HelloWorld1 {
    
// }
import java.util.Collections;
import java.util.*;
class HelloWorld1 {
    public static void main(String[] args) 
    {
        // System.out.println("Hello, World!");
        ArrayList<Integer> a= new ArrayList<>();
        a.add(10);
        a.add(100);
        a.add(50);
        a.add(27);
        a.add(17);
        
        Collections.sort(a);
        System.out.println(a);
        
    }
}