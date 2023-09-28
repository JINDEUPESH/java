// package static;
import java.util.Scanner;
class LaunchFarmer
{
    int pa;
    float td;//time duration
    static float ri;//rate of interest
    float si;//simple interest
    
    static
    {
        ri=4.5f;
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter amount required");
        pa=in.nextInt();
        System.out.println("Please enter the time duration");
        td=in.nextInt();
        
    }
    void compute()
    {
        si = (pa*td*ri)/100;
    }
    void disp()
    {
        System.out.println("the SI is : "+si);
    }

}
public class Farmer 
{
    public static void main(String[] args) 
    {
        LaunchFarmer f1 = new LaunchFarmer();
        LaunchFarmer f2 = new LaunchFarmer();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();

    }
}
