/*
98765
4321
098
76
5
 */
public class pattern_18
{
    public static void main(String args[])
    {
        int a=9;
        for (int i=1;i<=5;i++)
        {
            for (int j=i;j<=5;j++)
            {
                System.out.print(a);
                a--;
                if (a<0)
                    a=9;
            }
            System.out.println();
        }
    }
}