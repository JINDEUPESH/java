
import java.io.*;
public class FilesAll 
{
    public static void main(String[] args) throws IOException
    {
        
        File file1 = new File("PW.txt");
        System.out.println(file1.exists());
        //create a file
        file1.createNewFile();
        System.out.println(file1.exists());

        File dir = new File("Upesh");
        System.out.println(dir.exists());
        //create a directory
        dir.mkdir();
        System.out.println(dir.exists());


        File file = new File(dir,"PW.txt");
        file.createNewFile();
        System.out.println(file.isFile());

        //to count how many files that are in directory

        int count=0;
        File f = new File("null");
        String str[]=f.list();
        for(String name: str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println(count);

        
    }
}
