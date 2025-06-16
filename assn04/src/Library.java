import java.util.ArrayList;
import java.util.List;

public class Library {
    //. Use string1.equals(string2) for comparing
    String address;
    //妙啊，用数列存（tips，ArrayList容量.size()）
    List<Book> books = new ArrayList<>();

    public Library(String address){
        this.address = address;
    }

    //所有对象都相同的属性，用static
    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printAddress(){
        System.out.println(address);
    }


    public void printAvailableBooks(){
        boolean available = false;
        //如果数量为0根本不会进行，所以不用另外写
        for (Book book: books){
            if(!book.borrowed) {
                System.out.println(book.title);
                available = true;
            }
        }
        if(!available) System.out.println("None");
    }


    public void borrowBook(String name){
        //boolean found = false; 不需要！因为找到了就return
        for(Book book: books){
            //用.equals()表示内容相同
            if(name.equals(book.title)) {
                //found = true;
                if(book.borrowed) System.out.println("Sorry, you are late");
                else{
                    book.rented();
                    System.out.println("Successfully borrowed" + name);
                }
                return;//找到了就提前结束
            }
        }
        System.out.println("Not in our catalog");
    }


    public void returnBook(String name){
        for(Book book: books){
            if(name.equals(book.title)) {
                if(book.borrowed) {
                    book.returned();
                    System.out.println("Successfully returned " + name);
                }
                else{
                    System.out.println("What?");
                }
                return;//找到了就提前结束
            }
        }
    }




    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
