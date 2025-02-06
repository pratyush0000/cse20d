package classbasics;
import java.util.ArrayList;

public class Books {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Books> bookCollection = new ArrayList<>();

    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook(Books book) {
        bookCollection.add(book);
    }

    public static void removeBook(Books book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Books> getBookCollection() {
        return bookCollection;
    }

    public static void main(String[] args) {
        Books book1 = new Books("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Books book2 = new Books("An Introduction to Python", "Guido van Rossum", "9355423489");

        addBook(book1);
        addBook(book2);

        System.out.println("List of books:");
        for (Books book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        removeBook(book1);

        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Books book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
