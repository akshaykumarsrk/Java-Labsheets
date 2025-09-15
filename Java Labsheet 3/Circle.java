
class Radius{
    int radius;
    Radius(){
        radius=5;
    }
    void calcArea(){
        System.out.println("Area of the circle : "+3.14*5*5);
    }
}
class area{
    int rad;
    area(){
        rad=10;
    }
    public void Area(){
        System.out.println(" The area of the circle is : "+ 2*3.14*rad);
    }
}

public class Circle {
    public static void main(String args[]){
        Radius obj = new Radius();
        obj.calcArea();
        area ob1 = new area();
        ob1.Area();
    }
}
