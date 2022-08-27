 class diamond
{
    public static void diamond(int n)
    {
    int i,j,k,x,y,z ;
    for(i=0;i<n/2;i++){
        for(k=0;k<=i;k++)
            System.out.print(" ");
        for(j=0;j<2*i-1;j++)
             System.out.print("*");
        System.out.print("\n");
    }
    
    for(x=0;x<n-i;x++){
        for(z=0;z<=i;z++)
            System.out.print(" ");
        
        
        
        
        for(y=0;y<7-2*x;y++)
            System.out.print("*");
    System.out.print("\n");  
   
    }
    
    }
    
}    
