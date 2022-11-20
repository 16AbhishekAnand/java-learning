import java.util.Scanner;
public class SimCalSwcas
{
    public static void main()
    {
        int res=0; // for doing any operation var should be intialised at first. 
        double div;
        Scanner sc = new Scanner (System.in);  // In place of sc it can be any name as varialbe written on it.
        System.out.println("Enter the two number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter the opreator");
        char op= sc.next().charAt(0); // to get input as char.
        switch(op)
        {
            case '+': res=a+b;
                break;
            case '-': res=a-b;
                break;
            case '*': res=a*b;
                break;
            case '%': res=a%b;
                break;
            case '/': div=a/b;
                break;    
            default: System.out.println("Enter the appropiate operator"); 
        }            
        
        System.out.println("result="+ res);
        
    }
}
