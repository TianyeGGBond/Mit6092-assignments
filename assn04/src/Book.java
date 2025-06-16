public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    // Marks the book as rented
    public void rented() {
        // 布尔值判断直接用！
        if(!borrowed) this.borrowed = true;
        else System.out.println("Already rented.");
    }

    // Marks the book as not rented
    public void returned() {
        if(borrowed) this.borrowed = false;
        else System.out.println("What?");
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return(borrowed);
    }

    // Returns the title of the book
    public String getTitle() {
        return(title);
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
