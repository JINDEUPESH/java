//the difference between static and non static block is static methods are independent of objects
//For static methods we need not to create the object,but we can also refer them by using objects
//

public class staticmehod 
{
    public static void main(String[] args) 
    {
        Demo.disp1();
        //object is not created
        // Demo.disp2() //gives an error because the object is must for non static block
        Demo a =new Demo();
        a.disp();
    }    
}
class Demo
{
    static void disp1()
    {
        System.out.println("static method");
    }
    
    void disp()
    {
        System.out.println("non static block");
    }
}