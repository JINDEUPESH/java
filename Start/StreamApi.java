

import java.util.stream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
public class StreamApi 
{
       public static void main(String[] args) 
       {
            List<Integer> l = new ArrayList<>();
            
            l.add(1);
            l.add(2);
            l.add(34);
            l.add(14);
            l.add(15);
            l.add(61);
            l.add(17);

            System.out.println(l);

            Stream<Integer> s = l.stream();

            l.stream().sorted().forEach(System.out::println);
            
       } 
}
