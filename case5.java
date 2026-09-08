import java.util.Scanner;

class Book {
    int bookId;
    String bookTitle;
    String author;
    boolean available = true;

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (available) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued");
        }
    }
}

public class case5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter book ID: ");
        b.bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter book title: ");
        b.bookTitle = sc.nextLine();

        System.out.print("Enter author name: ");
        b.author = sc.nextLine();

        System.out.println("\nBook Details:");
        b.displayBook();

        System.out.println("\nIssuing book:");
        b.issueBook();

        System.out.println("\nBook Details:");
        b.displayBook();

        System.out.println("\nTrying to issue book again:");
        b.issueBook();

        System.out.println("\nReturning book:");
        b.returnBook();

        System.out.println("\nBook Details:");
        b.displayBook();

        sc.close();
    }
}