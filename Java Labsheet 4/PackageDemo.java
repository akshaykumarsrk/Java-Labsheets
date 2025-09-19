
// 4. Demonstrating default access within same package
package mypackage;

class PackageClass {
    String defaultMessage = "This is default access";

    void showMessage() {
        System.out.println(defaultMessage);
    }
}

public class PackageDemo {
    public static void main(String[] args) {
        PackageClass obj = new PackageClass();
        obj.showMessage();
    }
}
