public interface Movable 
{
    void moveUp();
    void moveDown();
}
class Robot implements Movable
{
    @Override
    public void moveUp() {
        System.out.println("Move Up");
    }
    public void moveDown()
    {
        System.out.println("Move Down");
    }
}
public class Program12 {
    public static void main(String[] args) {
        new Robot();
    }
}
