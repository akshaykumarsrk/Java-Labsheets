
class Book{
    String title;
    String author;
    double price;
    Book(){
        this.title = "Title1";
        this.author = "author1";
        this.price = 199;
    }
    void bookdetails(){
        System.out.println("Title :"+title);
        System.out.println("Author : " + author);
        System.out.println("Price : "+price);
    }

}

public class Books {
    public static void main(String args[]){
        Book book1 = new Book();
        book1.bookdetails();

    }
}
