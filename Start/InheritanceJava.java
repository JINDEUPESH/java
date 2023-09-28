class Human
{
    private String name="upesh";//does not inherited in child class
    int age=10;
    void age()
    {
        System.out.println("Age : "+age);
        System.out.println(name);
    }
}

class student extends Human
{
    
}

public class InheritanceJava 
{
    public static void main(String[] args) 
    {
        student s = new student();
        s.age();
    }    
}
