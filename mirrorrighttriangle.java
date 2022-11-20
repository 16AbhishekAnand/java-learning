public class MirrorRightTriangle extends Pattern
{
    public void value(int n)
    {
    int i,j,k;
    for(i=0;i<n;i++)
    {
        for(k=0;k<n-i-1;k++)
            System.out.print(" ");
        for(j=0;j<=i;j++)
            System.out.print("*");
        System.out.print("\n");
    }
        
    
    
    
    
    }

    
}
