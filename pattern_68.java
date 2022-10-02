public class pattern_68 
{
    public static void main(String[] args) 
    {
        int c=0;
        for (int i=1;i<=5;i++)
        {
            c=i;
            for (int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }    
    }
}
