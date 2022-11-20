public class ReversePyramid extends Pattern
{
    public void drawReversePyramid(int n) //camelCase
    {
    int i,j,k;
    for(i=0;i<n;i++)
    {
        for(k=0;k<=i;k++)
            System.out.print(" ");
        for(j=0;j<n-i;j++)
            System.out.print("* ");
        System.out.print("\n");
        
    }    
    }

    
}
