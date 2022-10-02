public class pattern_53
{
    public static void main(String[] args) 
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(" ");
                if (i==j)
                {
                    System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }
    }    
}
