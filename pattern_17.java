/*
1
23
456
7890
12345
 */
public class pattern_17
{
    public static void main(String args[])
    {
        int a=1;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
                if (a==10)
                    a=0;
            }
            System.out.println();
        }
    }
}