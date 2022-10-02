public class pattern_78 
{
    public static void main(String[] args) 
    {
        String a="LIRIL";
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (i==j)
                {
                    System.out.print(a.charAt(i));
                    break;
                }
                System.out.print(" ");
            }
            System.out.println();
        }    
    }
}
