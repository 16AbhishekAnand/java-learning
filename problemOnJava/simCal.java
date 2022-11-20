import java.util.Scanner;
public class simCal
{
    public static void main() // to take inout from user 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        solve(a,b,op);
    }    
    
    public static int solve(int a, int b, char op)// converts the string to integer and solve
    {
        int ans=0; //variable should be intialised at first while using with if else.
        
        if (op == '+') 
        {
            ans = a + b;
        }
        else if (op == '-') 
        {
            ans = a - b;
        }
        else if (op == '*') 
        {
            ans = a * b;
        }
        else if (op == '%') 
        {
            ans = a % b;
        }
        else if (op == '/')
        {
            ans = a / b;
        }
        System.out.println("Your answer is - " + ans);
        return ans;
    
            
    }
}    


