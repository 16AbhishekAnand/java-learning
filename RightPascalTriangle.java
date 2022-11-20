public class RightPascalTriangle extends Pattern
{
    public void drew(int n)
    {
        int i,j,x,y;
        for(i=0;i<n/2;i++)
        {    
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(x=0;x<n-n/2;x++)
        {
            for(y=0;y<n-n/2-x-1;y++)
            {
                System.out.print("*");
            }    
            System.out.print("\n");
        }
    }
}
