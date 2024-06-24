public class Book {
    private String title, author;
    private double price;
    private static int count;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("Shireesh Ko Phool", "Parijat", 150);
        Book secondBook = new Book("Muna Madan", "Laxmi Prasad Devkota", 100);

        System.out.println("No. of books in the shelf: " + count);
        System.out.println("1.\tTitle: " + firstBook.title + "\n\tAuthor: " + firstBook.author + "\n\tPrice: " + firstBook.price);
        System.out.println("\n2.\tTitle: "+ secondBook.title + "\n\tAuthor: " + secondBook.author + "\n\tPrice: " + secondBook.price);
    }
}
