public class pattern_43
{
    public static void main(String args[])
    {
        int n=3;
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=(i*2)-1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=n+1;i<=(n*2)-1;i++)
        {
            for (int j=i;j<=(n*2)-1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}