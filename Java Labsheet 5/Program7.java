final class Parent
{
    void fun1()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    void fun2()
    {
        System.out.println("Child");
    }
}
public class Program7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun1();
        c.fun2();
    }
}

// final class are fixed, we cannot make changes or inherit the final class
