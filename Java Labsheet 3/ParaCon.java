class Vehicle {
    int speed;
    String color;

    Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    void displayDetails() {
        System.out.println("Speed : " + speed + " km/h");
        System.out.println("Color : " + color);
    }
}

public class ParaCon {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(400, "Blue");
        car.displayDetails();
    }
}
