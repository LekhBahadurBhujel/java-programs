public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // Example usage
        Book myBook = new Book("Muna Madan", "Laxmi Psd. Devkota");
        myBook.displayInfo();
    }
}
