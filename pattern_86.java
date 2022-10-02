public class pattern_86 
{
    public static void main(String[] args) 
    {
        int c=1;
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (int k=1;k<c;k++)
            {
                System.out.print(k);
            }
            System.out.println();
            c++;
        }    
    }    
}
