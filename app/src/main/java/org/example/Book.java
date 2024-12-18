public class Book {

    // Attributes of the Book class
    private String title;
    private String author;
    private int yearPublished;

    // Constructor to initialize a new Book object
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter for the title of the book
    public String getTitle() {
        return title;
    }

    // Setter for the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the author of the book
    public String getAuthor() {
        return author;
    }

    // Setter for the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for the year the book was published
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter for the year the book was published
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Optionally, override toString() to print book details easily
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished + "]";
    }
}

    
