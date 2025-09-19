
// 11. Static nested class
class Outer {
    static class Inner {
        public void show() {
            System.out.println("Hello from Inner class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
