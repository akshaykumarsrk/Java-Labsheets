class Person {
    void displayFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}

public class FullName {
    public static void main(String[] args) {
        Person p = new Person();
        p.displayFullName("Priyanshu", "Sharma");
    }
}
