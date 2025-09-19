
// 15. Varargs demo
class VarargsDemo {
    public static void printStrings(String... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printStrings("Hello", "World", "Java", "Varargs");
    }
}
