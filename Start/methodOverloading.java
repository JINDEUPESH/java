class calc
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class methodOverloading 
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        int result = obj.add(10,20);
        System.out.println(result);
    }    

}
