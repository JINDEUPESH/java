
import java.util.*;

enum colours
{
    VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED;
    String colour;
    colours()
    {
        System.out.println("This is a colour");
    }
    void setColours(String colour)
    {
        this.colour=colour;
    }
    String getColours()
    {
        return colour;
    }
}
public class EnumApi 
{
    public static void main(String[] args) 
    {
        
        colours.RED.setColours("RED");
        String m = colours.RED.getColours();;
        System.out.println(m);

        for(colours c:colours.values())
        {
            System.out.println(c);
        }
    }
}
