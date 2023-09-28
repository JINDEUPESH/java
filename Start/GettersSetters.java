public class GettersSetters 
{
    private String car_name;
    private int car_number;

    public GettersSetters(String car_name,int car_number)
    {
        this.car_name=car_name;
        this.car_number=car_number;
    }
    public String getName()
    {
        return car_name;
    }
    public int getNumber()
    {
        return car_number;
    }
    public static void main(String[] args) 
    {
        GettersSetters gs = new GettersSetters("Suzuki", 8888);
        System.out.println(gs.getName());
        System.out.println(gs.getNumber());
        System.out.println(gs.getClass());    
    }
}
