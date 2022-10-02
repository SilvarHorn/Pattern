public class pattern_73
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=0;i<a.length();i++)
        {
            for (int k=a.length()-1;k>i;k--)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
    }
    }
}
