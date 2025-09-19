
// 14. Recursive GCD
class GCD {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 56, b = 98;
        System.out.println("GCD: " + gcd(a, b));
    }
}
