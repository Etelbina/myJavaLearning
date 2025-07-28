public class CodeExercise{
    public static void main(String[] args){

        // Create a class `Book`
        //with attributes: `title`, `author`, `final String genre`
        class Book {
            String title;
            String author;
            String genre;

            // Create a method `describe()` that prints book details
            public void describe(String description) {
                System.out.println(description);
            }

            // Include a default constructor and a parameterized one
            Book() {
                this.title = "Unknown";
                this.author = "Anonymus";
                this.genre = null;
            }

            Book(String title, String author, String genre) {
                this.title = title;
                this.author = author;
                this.genre = genre;
            }

            // Create `getTitle()`, `getAuthor()`, and `setAuthor()`
            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String newAuthor) {
                this.author = newAuthor;
            }
        }

        // Create an interface `Borrowable` with `borrow()` and `returnBook()` methods
        interface Borrowable {
            public void borrow();
            public void returnBook();
        }

        // Create a subclass `LibraryBook` that:
            //- Extends `Book`
            //- Implements `Borrowable`
            //- Overrides `describe()` to include borrowing status
            //- Uses `@Override` and `protected` if appropriate
        class LibraryBook extends Book implements Borrowable {
            public void borrow() {
                System.out.println("Yes, it's abailable.");
            }

            public void returnBook() {
                System.out.println("Return before 15 days.");
            }

            // constructor for subclass
            LibraryBook(String title, String author, String genre) {
                super(title, author, genre);
            }
        }
        
        Book bookFound = new Book();

        System.out.println("Book I found title: " + bookFound.title);
        System.out.println("Book I found author: " + bookFound.author);
        System.out.println("Book I found genre: " + bookFound.genre);
        System.out.println("Book I found description: ");
        bookFound.describe("No description found");

        Book myBook = new Book("Intersting", "Not found", "Adventures");

        System.out.println("\nGet my book title: " + myBook.getTitle());
        System.out.println("My book author: " + myBook.author);
        myBook.setAuthor("Me");
        System.out.println("Get my book new author: " + myBook.getAuthor());
        System.out.println("My book genre: " + myBook.genre);
        System.out.println("My book description: ");
        myBook.describe("This is a crazy book");

        LibraryBook libraryBook = new LibraryBook("The Hobbit", "Pending", "Fantasy");
        
        System.out.println("\nGet library book title: " + libraryBook.getTitle());
        System.out.println("Library book author: " + libraryBook.author);
        libraryBook.setAuthor("J.R.R. Tolkien");
        System.out.println("Library book new author: " + libraryBook.getAuthor());
        System.out.println("Library book genre: " + libraryBook.genre);
        System.out.println("Book description: ");
        libraryBook.describe("A story about a hobit adventures");
        System.out.println("Can I borrow it? ");
        libraryBook.borrow();
        System.out.println("For how long? ");
        libraryBook.returnBook();
        


        /*
        Create a small object-oriented system that includes:
        - Class with attributes and methods
        - Constructors (default + parameterized)
        - Encapsulation with getters/setters
        - Inheritance + interface
        - Method overriding
            ```
            Title: The Hobbit
            Author: J.R.R. Tolkien
            Genre: Fantasy
            Borrowed: false
            Describing: The Hobbit by J.R.R. Tolkien (Fantasy)
            Borrowing book...
            Returned book.
            ```
        */
    }
}