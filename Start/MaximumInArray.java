public class MaximumInArray 
{
    public static void main(String[] args) 
    {
        int a[]={34,21,54,65,43};
        // int max=a[0];
        // for(int i=0;i<a.length;i++)
        // {
        //         if(a[i]>max)
        //         {
        //             max=a[i];
        //         }
        // }
        // System.out.println(max);


        //Second max
        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=i+1;j<a.length;j++)
        //     {
        //         if(a[i]<a[j])
        //         {
        //             int temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        // }
        // System.out.println(a[a.length-2]);

        //largest in 2D array
        int arr[][]={{1,2,4,0},
                     {2,5,7,-1},
                     {4,2,6,9}};
        int large=arr[0][0];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]>large)
                {
                    large=arr[i][j];
                }
            }
        }
        System.out.println(large);
    }
           
}
