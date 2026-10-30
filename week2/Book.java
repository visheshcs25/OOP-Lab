class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // Search by Book ID
    void search(int id) {
        if (bookID == id) {
            System.out.println("Book found by ID:");
            display();
        } else {
            System.out.println("Book ID not found.");
        }
    }

    // Search by Title
    void search(String title) {
        if (this.title.equalsIgnoreCase(title)) {
            System.out.println("Book found by Title:");
            display();
        } else {
            System.out.println("Book Title not found.");
        }
    }

    // Compare two books and return the costlier book
    Book costlierBook(Book b) {
        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }
}
