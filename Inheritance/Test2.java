class paragraph
{
    void intro()//declaring the method.
    {
        System.out.println("Helloworld");
    }    
}        
class body extends paragraph
{ 
    void body()
    {
        System.out.println("\tContent of Body");
    }
}    
class ThankYou extends body
{
    void EndLine()// declaring the method.
    {
        System.out.println("Thanking you!");
    }
}
public class Test2
{
    public static void main(String args[])
    {
        ThankYou T=new ThankYou();// captial letter can be used as reference.
        T.intro(); //acessing from super to super class.
        T.body(); //acessing using method name.
        T.EndLine();// acessing the character of own class.
    }
        
    
    
    
}
