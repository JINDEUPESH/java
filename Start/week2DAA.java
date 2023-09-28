import java.util.Scanner;
public class week2DAA 
{
    public static void main(String[] args)
    {
        int object,m;
        Scanner in = new Scanner(System.in);
        System.out.println("enter total objects:");
        object=in.nextInt();
        int profit[] = new int[object];
        int weight[] = new int[object];
        double p_w[] = new double[object];
        for(int i=0;i<object;i++)
        {
            System.out.println("Enter the profit:");
            profit[i]=in.nextInt();
            System.out.println("Enter the weight:");
            weight[i]=in.nextInt();
        }
        System.out.println("enter the capacity of knapsack:");
        m=in.nextInt();
        for(int i=0;i<object;i++)
        {
            p_w[i]= (double) profit[i]/(double) weight[i];
        }

        System.out.println("--------------------");
        System.out.println("------Data set------");
        System.out.println("--------------------");
        
        System.out.print("objects:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+i+"\t");
        }
        System.out.println();

        System.out.print("profit :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+profit[i]+"\t");
        }
        System.out.println();

        System.out.print("weight :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+weight[i]+"\t");
        }
        System.out.println();

        System.out.print("P/W    :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+p_w[i]+"\t");
        }
        System.out.println();

        // System.out.println("--------------------");
        // System.out.println("---Arranging set----");
        // System.out.println("--------------------");
        
        // int temp,temp1,temp2;
        for(int i=0;i<object;i++)
        {
            for(int j=i+1;j<object;j++)
            {
                double temp1 = p_w[j];
                p_w[j]=p_w[i];
                p_w[i]=temp1;
                int temp2 = profit[j];
                profit[j]=profit[i];
                profit[i]=temp2;
                int temp3 = weight[j];
                weight[j]=weight[i];
                weight[i]=temp3;
            }
        }

        System.out.println("--------------------");
        System.out.println("---Arranging set----");
        System.out.println("--------------------");

        System.out.print("objects:");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+i+"\t");
        }
        System.out.println();

        System.out.print("profit :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+profit[i]+"\t");
        }
        System.out.println();

        System.out.print("weight :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+weight[i]+"\t");
        }
        System.out.println();

        System.out.print("P/W    :");
        for(int i=0;i<object;i++)
        {
            System.out.print("\t"+p_w[i]+"\t");
        }
        System.out.println();

        int k=0;
        // int i;
        double sum=0;
        while(m>0)
        {
            if(weight[k]<m)
            {
                sum= sum+1*profit[k];
                m=m-weight[k];
            }
            else
            {
                double x4= m*profit[k];
                double x5= weight[k];
                double x6= x4/x5;
                sum = sum + x6;
                m=0;
            }
            k++;
        }
        System.out.println("Final profit="+sum);

    }    
}
