class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if(b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition       : " + calc.add(50, 5));
        System.out.println("Subtraction    : " + calc.subtract(50, 5));
        System.out.println("Multiplication : " + calc.multiply(50, 5));
        System.out.println("Division       : " + calc.divide(50, 5));
    }
}
