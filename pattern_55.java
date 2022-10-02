public class pattern_55
{
    public static void main(String[] args) 
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if ( j == i || j == ((5-i)+1) )
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
