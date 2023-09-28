public class AssignmentEn 
{
    int age;
    String name;
    AssignmentEn(String name,int age)
    {
        this.name=name;
        this.age = age;
    }
    void printname()
    {
        System.out.println("name: "+name+"age: "+age);
    }
    public static void main(String[] args) 
    {
        
        AssignmentEn as = new AssignmentEn("upesh", 25);
        as.printname();    
    }
    
}
