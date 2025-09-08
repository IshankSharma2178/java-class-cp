public class BookBasic {
    private String title;
    private String author;
    private double price;

    public BookBasic() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public BookBasic(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        BookBasic b1 = new BookBasic();
        BookBasic b2 = new BookBasic("Clean Code", "Robert C. Martin", 29.99);
        b1.display();
        b2.display();
    }
}
