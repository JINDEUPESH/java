
import java.io.OutputStream;
import java.time.*;


enum Week
{
    MON,TUE,WED,THUR,FRI,SAT,SUN;
}
public class DateApi 
{
    public static void main(String[] args) {

        // System.out.println("-----DateClass-----");
        // LocalDate dt  = LocalDate.now();
        // System.out.println(dt);
    

        // System.out.println("-----DateTimeClass-----");
        // LocalDateTime d = LocalDateTime.now();
        // System.out.println(d);

        // System.out.println("-----TimeClass-----");
        // LocalTime t = LocalTime.now();
        // System.out.println(t);
        String k="";
        String s = "12:00:00AM";
        if(s.contains("PM"))
        {
            // time.substring(0, time.length()-2);
            // System.out.println(time.substring(0, time.length()-2));
            LocalTime t =LocalTime.parse(s.substring(0, s.length()-2));
            // System.out.println(t);
            System.out.println(t.getHour());
            k = (t.plusHours(12)).toString();
            // System.out.println(t.plusHours(12));
        }
        else if(s.contains("AM"))        
        {
            LocalTime n = LocalTime.parse(s.substring(0,s.length()-2));
            // if(n.getHour()==12)
            //     k = (n.minusHours(12)).toString();
            if(n.getHour()>=12)
                k = (n.minusHours(12)).toString();
            else
                k=n.toString();
        }
        
        


    }
}
