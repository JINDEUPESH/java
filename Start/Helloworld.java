// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the values of a,b and c:");
        a=in.nextInt();//method
        b=in.nextInt();
        c=in.nextInt();
        int d = a + b + c;
        System.out.println("sum = "+d);
        // System.out.println("sum of "+a+"+ "+b+"+ "+c+"is " +d );
        float avg = d/3;
        System.out.println("\naverage = "+String.format("%.2f",avg));
        System.out.printf("\naverage = %.2f",avg);
        
    }
}