class Person
{
    Person()
    {
        System.out.println("Person");
    }
}
class Student extends Person
{
    Student()
    {
        super();
        System.out.println("Student");
    }
}
public class Program2 
{
    public static void main(String[] args) 
    {
        new Student();
    }   
}
