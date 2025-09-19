class StaticAccess {
    private static int value;

    public static void setValue(int v) {
        value = v;
    }

    public static int getValue() {
        return value;
    }

    public static void main(String[] args) {
        StaticAccess.setValue(42);
        System.out.println("Value: " + StaticAccess.getValue());
    }
}
