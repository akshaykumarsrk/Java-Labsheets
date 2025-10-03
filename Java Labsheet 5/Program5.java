class Parent
{
    final void fun1()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    void fun1()
    {
        System.out.println("Child");
    }
}
public class Program5 
{
    public static void main(String[] args) {
        Child c = new Child();
        c.fun1();
    }
}

// we cannot override final methods because final values/methods are fixed
