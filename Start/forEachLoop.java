//enhanced for loop

class forEachLoop
{
    public static void main(String[] args) 
    {
        int num[] = {4,5,6,7};
        for(int b : num)
        {
            System.out.println(b);
        }
        System.out.println();

        int nums[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        for (int n[] : nums)
        {
            for(int a: n)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println(nums.length);
        System.out.println(num.length);

        String name = "upesh";
        System.out.println(name.length());

        // int[] a=new int[0];

        // System.out. println(a.length);
    }
}