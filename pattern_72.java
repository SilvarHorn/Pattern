public class pattern_72
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=0;i<a.length();i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(a.charAt(i));
            }
            System.out.println();
    }
    }
}
