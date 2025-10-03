class Parent
{
    void fun()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    void fun()
    {
        System.out.println("Child");
    }
}
public class Program9 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.fun();
    }
    
}
