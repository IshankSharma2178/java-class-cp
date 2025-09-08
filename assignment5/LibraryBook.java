public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Effective Java", "Joshua Bloch", 39.99, true);
        book.display();
        System.out.println("Borrowed: " + book.borrow());
        book.display();
        System.out.println("Borrowed again: " + book.borrow());
        book.display();
    }
}
