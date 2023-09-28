

import java.util.*;
public class StackDataStructure 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);

        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.empty());

        System.out.println(st.search(5));

        System.out.println(st.peek());

        Iterator<Integer> it = st.iterator();
        System.out.println();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
