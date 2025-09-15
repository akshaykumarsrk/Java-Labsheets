class Car {
    String brand;
    int speed;

    Car setBrand(String brand) {
        this.brand = brand;
        return this; 
    }

    Car setSpeed(int speed) {
        this.speed = speed;
        return this; 
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class Chaining {
    public static void main(String[] args) {

        Car car = new Car()
                    .setBrand("Tesla")
                    .setSpeed(150);

        car.display();
    }
}
