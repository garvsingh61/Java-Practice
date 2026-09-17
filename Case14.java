package CaseStudyExceptionHandling;
import java.util.*;

class Case14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount (%): ");
            double discount = sc.nextDouble();

            if (price <= 0)
                throw new Exception("Invalid product price");

            if (quantity <= 0)
                throw new Exception("Invalid quantity");

            if (discount < 0 || discount > 100)
                throw new Exception("Invalid discount percentage");

            double bill = price * quantity;
            bill = bill - (bill * discount / 100);

            System.out.println("Final Bill: " + bill);

            System.out.print("Enter payment: ");
            double payment = sc.nextDouble();

            if (payment < bill)
                throw new Exception("Payment amount is less than the bill");

            System.out.println("Payment successful!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}