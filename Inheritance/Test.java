 class Parent
{
    void car() 
    {
        System.out.println("CEO");
    }    
}    
class Child1 extends Parent
{
    void brand1()
    {
        System.out.println("BMW");
    }
}
class Child2 extends Parent
{
    void brand2()
    {
        System.out.println("Audi");
    }
}
class Child3 extends Parent
{
    void brand3()
    {
        System.out.println("Mercedes");
    }
}
public class Test
{
    public static void main(String args[])
    {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        Child3 c3=new Child3();
        
        c1.car();// acess parent class.
        c2.brand2(); //acess own class.   
        c3.brand3();
}
}
