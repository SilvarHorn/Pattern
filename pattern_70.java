public class pattern_70
{
    public static void main(String[] args) 
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print((k*2)-1);
            }
            for (int l=i-1;l>1-1;l--)
            {
                System.out.print((l*2)-1);
            }
            System.out.println();
        }        
    }
}