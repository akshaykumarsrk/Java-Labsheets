
class Dimensions {
    int length;
    int width;
    Dimensions (){
        length = 20;
        width = 30;
    }
    void calcArea() { 
        System.out.println("Area of the Rectangle : "+ length*width);
    }
    void calcPerimeter(){
        int perimeter = 2*(length+width);
        System.out.println("Perimeter of the rectangle is : "+ perimeter);
    }
}

public class Rectangle {
    public static void main(String args[]){
        Dimensions obj = new Dimensions();
        obj.calcArea();
        obj.calcPerimeter();
    }
}
