public class Diamond_1
{
    public static void diamond_1(int n)
    { int x,y,z,i,j,k;
        for(x=0;x<n/2;x++){
            for(y=0;y<(n/2)-x-1;y++){
                System.out.print(" ");
            }
            for(z=0;z<x+1;z++){
               System.out.print("* "); 
            }
        System.out.print("\n");
        }
        for(i=0;i<n/2;i++)
        {
            for(k=0;k<=i;k++)
                System.out.print(" ");
            for(j=0;j<(n/2)-i;j++)
                System.out.print("* ");
            System.out.print("\n");
        }
}
}
