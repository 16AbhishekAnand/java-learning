
public class LeftPasacalTriangle
{
    public static void LeftPasacalTriangle(int n)
    {
    int i,j,k,x,y,z;
    for(i=0;i<n/2;i++){
        for(j=0;j<n/2-i-1;j++){
            System.out.print(" ");
        }
        for(k=0;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(x=0;x<n-n/2;x++){
        for(y=0;y<=x;y++){
            System.out.print(" ");
        }
        for(z=0;z<n-n/2-x-1;z++){
            System.out.print("*");
        }    
        System.out.print("\n");
    }
}
}