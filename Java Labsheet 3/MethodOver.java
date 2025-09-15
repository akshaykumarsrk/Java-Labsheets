class Vehicle {
    int speed;
    int maxSpeed;

    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Current speed set to " + this.speed + " km/h");
    }

    void setSpeed(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        System.out.println("Current speed: " + this.speed + " km/h");
        System.out.println("Max speed    : " + this.maxSpeed + " km/h");
    }
}

public class MethodOver {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        bike.setSpeed(80);
        bike.setSpeed(200, 350);
    }
}
