public class pattern_77
{
    public static void main(String[] args) 
    {
        String a="LIRIL";
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (i==2)
                {
                    System.out.print(a.charAt(j));
                }
                else if (j==2)
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
