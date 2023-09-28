
import  java.io.*;
import  java.util.*;
import  java.lang.*;
class Dvector
{
	public static void main(String args[ ])
	{
    	int  i,j,n,s,min=100,p;
		int subnet[ ][ ],path[ ][ ],delay[][],edelay[ ],ndelay[ ],line[ ];
			System.out.println("Enter no. of routers : ");
			Scanner x= new Scanner(System.in);
			n=x.nextInt();
			subnet=new int[n][n];
			delay=new int[n][n];
			edelay=new int[n];
			ndelay=new int[n];
			line=new int[n];
			System.out.println ("Enter subnet :");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{		
				subnet[i][j]=x.nextInt();
				}				
			}
			System.out.println("The Subnet is :");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{		
					System.out.println(subnet[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("Enter Source node: ");
			s=x.nextInt();
			for(i=0;i<n;i++)
			{
				if(subnet[s][i]==1)
				{
		System.out.println("Enter Delay vectors for neighbour router-"+i);
					for(j=0;j<n;j++)
					{	
						delay[i][j]=x.nextInt();						
					}
System.out.println("Enter Stimulated delay from source-"+s+"toneighbour-"+i+":");	
			edelay[i]=x.nextInt();
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{		
					if(subnet[s][j]==1)
					{
						if(i!=s)
						{
							p=edelay[j]+delay[j][i];
							if(p<min)
							{
								min=p;		
								line[i]=j;
								ndelay[i ]=min;
							}
						}
						else
						{			
							ndelay[i]=0;		
							line[i]=s;
						}
					}
				}
				min=100;
			}
	System.out.println("The new delay vector from source "+s+"is: ");
			System.out.println("DELAY  LINE");
			System.out.println("-----   ----");
			for(i=0;i<n;i++)
			{
			System.out.println(ndelay[i]+"     "+line[i]);
			}
	}
}