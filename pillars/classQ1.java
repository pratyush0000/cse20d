// Book class
class Book {
    String title;
    int issueNumber;

    // Static variable for library name
    static String libraryName;

    // Static counter for unique issue numbers
    static int issueCounter = 5000;

    // Constructor
    public Book(String title) {
        this.title = title;
        this.issueNumber = generateIssueNumber();
    }

    // Static method to generate unique issue number
    static int generateIssueNumber() {
        return ++issueCounter; // Increment first, then return
    }

    // Static method to set the library name
    static void setLibrary(String name) {
        libraryName = name;
    }

    // Instance method to display book details
    void getBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Issue Number: " + this.issueNumber);
        System.out.println("Library Name: " + libraryName);
        System.out.println();
    }
}

// Driver class
public class classQ1 {
    public static void main(String[] args) {
        // Set the library name (static method)
        Book.setLibrary("Central Library");

        // Creating book records
        Book b1 = new Book("The Great Gatsby");
        Book b2 = new Book("Moby Dick");

        // Displaying book information
        b1.getBookInfo();
        b2.getBookInfo();
    }
}