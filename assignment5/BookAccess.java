public class BookAccess {
    public String ISBN;
    protected String title;
    private String author;

    public BookAccess(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookAccess {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void display() {
        System.out.println("EBook ISBN (public): " + this.ISBN + ", Title (protected): " + this.title + ", Author (via getter): " + getAuthor() + ", Size: " + fileSizeMB + " MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.6);
        eb.display();
        eb.setAuthor("J. Bloch");
        eb.display();
    }
}
