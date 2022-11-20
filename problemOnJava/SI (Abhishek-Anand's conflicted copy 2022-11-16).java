import java.util.Scanner;
public class SI
{
    public static void main()
    {
        int pri,rate,time;
        float si;
        Scanner obj=new Scanner(System.in); // obj is keyword here.
        // The above syntax need to write only once and rest all input will be stored in variable using obj.nextInt()
        System.out.println("Enter the principal amount");
        pri=obj.nextInt();
        System.out.println("Enter the rate:");
        rate=obj.nextInt();
        System.out.println("Enter the time:");
        time=obj.nextInt();
        si=pri*rate*time/100;
        System.out.println("The simple interest of given data is "+ si);
        
        

        
        
       
}
}