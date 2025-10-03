abstract class Shape 
{
    abstract void draw();
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Circle");
    }
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Circle");
    }
}
public class Program11 {
    public static void main(String[] args) 
    {
        new Circle.draw();
        new Rectangle().draw();
    }
}
