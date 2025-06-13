import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued.");
                } else {
                    System.out.println("Already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned.");
                } else {
                    System.out.println("Book wasn't issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
