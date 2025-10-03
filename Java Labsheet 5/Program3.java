class Parent
{
    private int a = 2;
    public int b = 3;
    protected int c = 5;
}
class Child extends Parent
{
    void test()
    {
        // Not Accessible
        System.err.println(a);
        // Print Address
        System.out.println(b);
        // Can be used in Sub class
        System.out.println(c);
    }
}
public class Program3 
{
    public static void main(String[] args) {
        new Child().test();
    }
}
