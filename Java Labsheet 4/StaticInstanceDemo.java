class StaticInstanceDemo {
    static int staticVar = 10;   // shared by all objects
    int instanceVar = 20;        // separate copy for each object

    public void display() {
        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        // First object
        StaticInstanceDemo obj1 = new StaticInstanceDemo();
        obj1.display();

        // Second object
        StaticInstanceDemo obj2 = new StaticInstanceDemo();
        obj2.display();

        // Changing values
        obj1.staticVar = 50;  // affects all objects
        obj1.instanceVar = 100; // affects only obj1

        // Display again
        System.out.println("After changes:");
        obj1.display();
        obj2.display();
    }
}
