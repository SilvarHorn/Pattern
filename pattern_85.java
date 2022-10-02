public class pattern_85 
{
    public static void main(String[] args) 
    {
        int c=65;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (i%2==0)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print((char)c);
                }
            }
            System.out.println();
            c++;
        }    
    }    
}
