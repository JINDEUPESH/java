import java.util.Scanner;
public class Knapscak2 
{
    public static void main(String[] args)
    {
        int object,m;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the total objects:");
        object=in.nextInt();
        int profit[] = new int[object];
        int weight[] = new int[object];
        for(int i=0;i<object;i++)
        {
            System.out.println("Enter the profit:");
            profit[i]=in.nextInt();
            System.out.println("Enter the weight:");
            weight[i]=in.nextInt();
        }
        System.out.println("Enter the capacity of knapsack:");
        m=in.nextInt();
        double p_w[]=new double[object];
        for(int i=0;i<object;i++)
        {
            p_w[i]=(double) profit[i] / (double) weight[i];
        }
    
        System.out.println("\n--------------------");
        System.out.println("\n-----Data set-------");
        System.out.println("\n--------------------");

        System.out.println("objects:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+i+"\t");
        }
        System.out.println();
        System.out.println("profit:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+profit[i]+"\t");
        }
        System.out.println();        
        System.out.println("weight:");

        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+weight[i]+"\t");
        }
        System.out.println();
        System.out.println("p/w:");

        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+p_w[i]+"\t");
        }
        System.out.println();

        System.out.println("\n--------------------\n");
        System.out.println("\n----Arranging set---\n");
        System.out.println("\n--------------------\n");

        for (int i=0;i<object;i++)
        {
            for(int j=i+1;j<object;j++)
            {
                if(p_w[i]<p_w[j])
                {
                    double temp=p_w[j];
                    p_w[j]=p_w[i];
                    p_w[i]=temp;
                    int temp1 = profit[j];
                    profit[j]=profit[i];
                    profit[i]=temp1;
                    int temp2 = weight[j];
                    weight[j]=weight[i];
                    weight[i]=temp2;
                }
            }
        }
        System.out.println("objects:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+i+"\t");
        }
         System.out.println();
        System.out.println("profit:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+profit[i]+"\t");
        }
        System.out.println();        
        System.out.println("weight:");

        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+weight[i]+"\t");
        }
        System.out.println();
        System.out.println("p/w:");

        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+p_w[i]+"\t");
        }
        System.out.println();

        int k=0;
        double sum=0;
        // System.out.println();
        while(m>0)
        {
            if(weight[k]<m)
            {
                sum=sum+1*profit[k];
                m=m-weight[k];
            }
            else
            {
                double x4=m*profit[k];
                double x5=weight[k];
                double x6= x4/x5;
                sum=sum+x6;
                m=0;
            }
            k++;
        }
        System.out.println("Final profit:"+sum);
    }
}

