public class pattern_74 
{
    public static void main(String[] args) 
    {
        String a="BLUE";
        for (int i=0;i<a.length();i++)
        {
            for (int j=i;j<a.length();j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
    }
    }
}
