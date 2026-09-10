import java.util.*;

public class BusTicket {
    int available = 30;

    void book(int age, int seats) {
        if (age <= 0)
            throw new ArithmeticException("Invalid age");

        if (seats <= 0)
            throw new ArithmeticException("Invalid seats");

        if (seats > available)
            throw new ArithmeticException("Insufficient seats");

        available = available - seats;
        System.out.println("Booking Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BusTicket p1 = new BusTicket();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter seats: ");
            int seats = sc.nextInt();

            p1.book(age, seats);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}