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
public class Program8 {
    public static void main(String[] args) {
        new Child().fun();
    }
}
