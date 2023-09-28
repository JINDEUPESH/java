
import java.io.*;
//filewriter 
public class WriteDataOnFile 
{
    public static void main(String[] args) throws IOException 
    {
        
        File dir = new File("PW");
        File file = new File(dir,"PW.txt");
        // System.out.println(file.exists());----false
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write("pWSkills");
        fw.write(60);//returns the unicode value of 60
        fw.write(98);
        char ch[] = {'a','c','x','d'};
        fw.write(ch);

        fw.close();
        
    }
}
