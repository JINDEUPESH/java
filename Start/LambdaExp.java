//cannot have 2 methods in interface
//functional interface
interface car
{
    void drive();
}

interface maruti
{
    void show(String name);
}
public class LambdaExp 
{
    public static void main(String[] args) 
    {
        car obj = () -> 
        {
            System.out.println("upeshhhhhhhhhhhhhhhh");
        };
        obj.drive();

        maruti m = (String name) ->
        {
            System.out.println(name);
        };
        m.show("suzuki");
    }
}
