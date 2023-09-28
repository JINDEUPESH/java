public class Assignmentenc 
{
    private static int count =0;
    public Assignmentenc()
    {
        count++;
    }
    public static int getInstanceCount()
    {
        return count;
    }
    public static void main(String[] args) 
    {
        Assignmentenc a1 = new Assignmentenc();
        Assignmentenc a2 = new Assignmentenc();
        Assignmentenc a3 = new Assignmentenc();
        
        System.out.println("Number of instances Created"+Assignmentenc.getInstanceCount());
    }
}
