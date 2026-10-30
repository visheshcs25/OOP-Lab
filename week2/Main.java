public class Main {
    public static void main(String[] args) {

        // Creating book objects
        Book b1 = new Book(101, "Java Programming", "James", 500);
        Book b2 = new Book(102, "Python Programming", "Guido", 700);
        Book b3 = new Book(103, "C Programming", "Dennis", 400);

        // Display book information
        System.out.println("BOOK DETAILS");
        b1.display();
        b2.display();
        b3.display();

        // Search by Book ID
        System.out.println("SEARCH BY BOOK ID");
        b1.search(101);

        // Search by Title
        System.out.println("SEARCH BY TITLE");
        b2.search("Python Programming");

        // Find the costlier book
        System.out.println("COSTLIER BOOK");
        Book costly = b1.costlierBook(b2);
        costly.display();

        // Display total number of books
        System.out.println("Total Books Created: " + Book.count);
    }
}
