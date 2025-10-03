class Animal
{
    void makeSound()
    {
        System.out.println("Sound");
    }
}
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog Sound");
    }
}
public class Program1
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.makeSound();
    }
}