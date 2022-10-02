public class pattern_79
{
    public static void main(String[] args) 
    {
        String a="LIRIL";
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (i==0 || i==4)
                {
                    System.out.print(a.charAt(j));
                }
                else if (j==0 || j==4)
                {
                    System.out.print(a.charAt(i));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}