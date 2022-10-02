public class pattern_76
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=a.length()-1;i>=0;i--)
        {
            for (int j=i;j<a.length();j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
    }
    }
}
