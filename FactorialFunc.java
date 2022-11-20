public class FactorialFunc
{
    public static void fact(int n)
    {
        int i;
        if(n==0)
        {
            System.out.println("factorail is 1");
            return;
        }     
        else if(n<0)
        {
            System.out.println("Eneter non-negative value");
        }
        else
        {
            int num=1;
            for(i=n;i>=1;i--)
            {
                num=num*i;
            }
            System.out.println(num);

        }
        return;
    }      
}