import java.util.*;

public class Book {
    String title;
    String author;
    final long isbn;

    Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    static String libraryName = "Anuj_Gyan_Sagar";

    public static void displayLibraryName() {
        System.out.println("Name of the library: " + libraryName);
    }

    public void display() {
        if (this instanceof Book) {
            System.out.println("The author of the book: " + this.author);
            System.out.println("The Title of the book: " + this.title);
            System.out.println("The ISBN of the book: " + this.isbn);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of books in library: ");
        int n = sc.nextInt();
        Book[] details = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter title of the book: ");
            String title = sc.next();

            System.out.print("\nEnter author of the book: ");

            String author = sc.next();

            System.out.print("\nEnter the isbn number of book: ");
            long isbn = sc.nextLong();
            details[i] = new Book(title, author, isbn);
        }
        displayLibraryName();
        for (Book detail : details) {
            detail.display();
        }

    }

}