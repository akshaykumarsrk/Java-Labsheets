class Vehicle
{
    void fun1()
    {
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle
{
    void fun2()
    {
        System.out.println("Car");
    }
}
class ElectricCar extends Car
{
    void fun3()
    {
        System.out.println("ElectricCar");
    }
}
public class Program4 
{
    public static void main(String[] args) 
    {
        ElectricCar c = new ElectricCar();    
        c.fun1();
        c.fun2();
        c.fun3();
    }    
}
