package CaseStudyExceptionHandling;
import java.util.*;

class Case11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int available = 50;

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter seats: ");
            int seats = sc.nextInt();

            if (age <= 0)
                throw new Exception("Invalid age");

            if (seats <= 0)
                throw new Exception("Invalid number of seats");

            if (seats > available)
                throw new Exception("Insufficient seats");

            System.out.println("Ticket booked successfully!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}