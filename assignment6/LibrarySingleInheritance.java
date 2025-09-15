class BookSI {
    protected String title;
    protected int publicationYear;
    public BookSI(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class AuthorSI extends BookSI {
    private String name;
    private String bio;
    public AuthorSI(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

class LibrarySingleInheritanceDemo {
    public static void main(String[] args) {
        AuthorSI a = new AuthorSI("Effective Java", 2018, "Joshua Bloch", "Java expert and author");
        a.displayInfo();
    }
}
