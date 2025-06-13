import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n📚 Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(id, title, author));
                    break;
                case 2:
                    lib.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    lib.issueBook(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    lib.returnBook(sc.nextInt());
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    return;
                default:
                    System.out.println("❌ Invalid choice");
            }
        }
    }
}
