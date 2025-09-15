class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

public class TwoBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 480);
        Book b2 = new Book("Python Basics", 490);

        b1.display();
        b2.display();
        b2 = b1;
        b1.price = 600;
        b1.display();
        b2.display();
    }
}
