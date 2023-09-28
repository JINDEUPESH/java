public class Rotatematrix   
{  
    public static void main(String args[])  
    {  
        //matrix to rotate   
        int a[][]= {{1,1,0,0},
                    {1,0,0,1},
                    {0,1,1,1},
                    {1,0,1,0}};    

        System.out.println("Original Matrix: \n");  
        //loop for rows  
        for(int i=0;i<4;i++)  
        {  
            //loop for columns  
            for(int j=0;j<4;j++)  
            {  
                //prints the elements of the original matrix  
                System.out.print(" "+a[i][j]+"\t");  
            }  
            System.out.println("\n");  
        }  


        System.out.println("Rotate Matrix by 90 Degrees Clockwise: \n");  
        
        for(int i=0;i<4;i++)  
        {  
            for(int j=3;j>=0;j--)  
            {  
                //prints the elements of the rotated matrix  
                System.out.print(""+a[j][i]+"\t");  
            }  
        System.out.println("\n");  
        }  
    }  
} 
