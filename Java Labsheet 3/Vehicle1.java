class Vehicle {
    void startEngine() {
        System.out.println("Engine started...");
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.startEngine();
    }
}
