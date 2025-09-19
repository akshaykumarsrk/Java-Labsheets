
// 3. Demonstrating protected access modifier
class Parent {
    protected String message = "Hello from Parent";

    protected void displayMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    public void show() {
        displayMessage();
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
