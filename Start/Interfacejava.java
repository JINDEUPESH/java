interface car
{
    void drive();
}

public class Interfacejava 
{
    public static void main(String[] args) 
    {
        car obj = new car()
        {
            public void drive()
            {
                System.out.println("driving");
            }
        };
        car x = new car()
        {
            public void drive()
            {
                System.out.println("upesh");
            }
        };
        obj.drive();

    }
}
