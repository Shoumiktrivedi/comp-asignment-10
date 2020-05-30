public class Q9a
{
    public static void main(String args[])
    {
        int sumofseries=0;
        int i=2;
        while(i<=20)
        {
            if(i% 4==0)
            {
             sumofseries=sumofseries-i;
            }
            else
            {
                sumofseries=sumofseries+i;
            }
            i=i+2;
        }
        System.out.println("sum of series:"+sumofseries);
    }
}
          
