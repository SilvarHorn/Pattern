public class pattern_83 
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(a.charAt(j));
            }
            for (int k=4;k>i;k--)
            {
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }  
    }    
}
