public class pattern_42
{
    public static void main(String args[])
    {
        for (int i=1;i<=3;i++)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=2;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}