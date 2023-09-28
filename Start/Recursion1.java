import java.util.Scanner;
public class Recursion1 
{
    public static void main(String[] args) 
    {
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n Value:");
        int n = in.nextInt();

        printName p = new printName();
        p.name(i,n);

        sum s =new sum();
        System.out.println("Sum of"+n+" Number is "+s.sumOfNumbers(n));

        factor f = new factor();
        int res = f.factorial(n);
        System.out.println("Factorial of "+n+ "is "+res);

        int n1=0;
        int n2=1;
        Fibonacci ff = new Fibonacci();
        System.out.print("Fibonacci series:");
        System.out.print(n1+" "+n2+" ");
        for(i=2;i<=n;i++)
        {
            System.out.print(ff.printFibonacci(i)+" ");
        }

        in.close();
    }
}
class printName
{
    int name(int i,int n)
    { 
        if(i<n)
        {
            System.out.println("hello");
            return name(i+1,n);
        }
        else
        {
            return 0;
        }
    }
}
class sum
{
    int sumOfNumbers(int n)
    {
        if(n<=0)
            return 0;
        else
            return n+sumOfNumbers(n-1);
    }
}

class factor
{
    int factorial(int n)
    {
        if(n==1)
        {
            return n;
        }
        else
        {
            return n*factorial(n-1);
        }
    } 
}

class Fibonacci
{
    int printFibonacci(int n)
    { 
        if(n==0 || n==1)
            return n;
        if(n==2)
            return 1;
        else
        {
            return printFibonacci(n-1)+printFibonacci(n-2);
        }
    }
}