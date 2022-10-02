public class pattern_75 
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=a.length();i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
    }
    }
}
