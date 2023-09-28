
import java.time.*;
public class DateTimeAS 
{
    public static void main(String[] args) 
    {
        
        // LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);
        LocalDate d = LocalDate.now();

        int n1 = d.getYear();
        int n2 = d.getMonthValue();
        int n3 = d.getDayOfMonth();

        System.out.println(n2+"/"+n3+"/"+n1);
    }
}
