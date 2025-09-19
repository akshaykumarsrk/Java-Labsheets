
// 9. Static and non-static methods in same class
class StaticNonStaticDemo {
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {
        staticMethod(); // static call

        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod(); // non-static call
    }
}
