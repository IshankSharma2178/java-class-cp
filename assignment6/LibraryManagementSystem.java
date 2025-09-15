interface Reservable {
    boolean reserveItem(String borrowerId);
    boolean checkAvailability();
}

abstract class LibraryItemLMS implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private String borrowerId; // sensitive

    public LibraryItemLMS(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String getItemDetails() {
        return "[" + itemId + "] " + title + " by " + author;
    }

    protected boolean isBorrowed() { return borrowerId != null; }

    @Override public boolean reserveItem(String borrowerId) {
        if (this.borrowerId == null) { this.borrowerId = borrowerId; return true; }
        return false;
    }
    @Override public boolean checkAvailability() { return borrowerId == null; }

    public abstract int getLoanDuration();
}

class BookLMS extends LibraryItemLMS {
    public BookLMS(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 14; }
}

class MagazineLMS extends LibraryItemLMS {
    public MagazineLMS(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVDLMS extends LibraryItemLMS {
    public DVDLMS(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 5; }
}

class LibraryManagementSystemDemo {
    public static void main(String[] args) {
        LibraryItemLMS[] items = new LibraryItemLMS[] {
            new BookLMS("B001", "Clean Code", "Robert C. Martin"),
            new MagazineLMS("M001", "Tech Monthly", "Editorial"),
            new DVDLMS("D001", "Inception", "Christopher Nolan")
        };
        for (LibraryItemLMS i : items) {
            System.out.println(i.getItemDetails() + ", Loan: " + i.getLoanDuration() + " days, Available: " + i.checkAvailability());
        }
        items[0].reserveItem("U123");
        System.out.println(items[0].getItemDetails() + ", Available: " + items[0].checkAvailability());
    }
}
