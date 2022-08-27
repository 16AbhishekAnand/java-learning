public class lefttriangle  //Triangle facing towards left.
{
    public static void triangle(int n){
        int x,y,z;
        for(x=0;x<n;x++){
            for(y=0;y<n-x-1;y++){
                System.out.print(" ");
            }
            for(z=0;z<x+1;z++){
               System.out.print("* "); 
            }
        System.out.println();    
      
            
        
    
    
        }
    }
}    