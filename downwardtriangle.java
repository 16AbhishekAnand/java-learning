public class DownwardTriangle extends Pattern
{
    
    public void draw(int n)
    {
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i;j++)
            System.out.print("* ");
        System.out.print("\n");   
        
    }
    }
}   
