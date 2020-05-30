public class Q10a
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i);
            for(int j=i;j<=i;j++)
            {
                if(j%2==1)
                System.out.print("*");
                else
                System.out.print("#");
            }
            System.out.println();
        }
    }
}