class MathUtil {
    int sum(int... numbers) {
        int total = 0;
        for(int n : numbers) {
            total += n;
        }
        return total;
    }
}

public class SumOfIntegers {
    public static void main(String[] args) {
        MathUtil mu = new MathUtil();

        System.out.println("Sum = " + mu.sum(30, 20));
        System.out.println("Sum = " + mu.sum(3, 56, 23, 99));
    }
}
