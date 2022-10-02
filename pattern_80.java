public class pattern_80
{
    public static void main(String argss[])
    {
        String a="LIRIL";
        int c=a.length()-1;
        for (int i=0;i<(a.length()/2)+1;i++)
        {
            for (int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<=c;j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
            c--;
        }
    }
}