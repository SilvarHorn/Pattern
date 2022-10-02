public class pattern_88 
{
    public static void main(String[] args) 
    {
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.print("*");
            for (int k=i;k<5;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }    
    }    
}
