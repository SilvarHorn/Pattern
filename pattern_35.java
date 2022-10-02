public class pattern_35
{
    public static void main(String argss[])
    {
        for (int i=1;i<=3;i++)
        {
            for (int j=i;j<(i*2);j++)
            {
                System.out.print(j);
            }
            for (int k=(i*2)-2;k>=i;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}