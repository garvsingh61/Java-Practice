import java.util.*;

public class OnlineShopping {

    double calculateBill(double price, int quantity, double discount) {

        if (price <= 0)
            throw new ArithmeticException("Invalid Product Price");

        if (quantity <= 0)
            throw new ArithmeticException("Invalid Quantity");

        if (discount < 0 || discount > 100)
            throw new ArithmeticException("Invalid Discount Percentage");

        double total = price * quantity;

        double discountAmount = total * discount / 100;

        double finalAmount = total - discountAmount;

        return finalAmount;
    }

    void makePayment(double bill, double payment) {

        if (payment < bill)
            throw new ArithmeticException("Payment amount is less than the bill");

        double remaining = payment - bill;

        System.out.println("Payment Successful");
        System.out.println("Remaining Amount: " + remaining);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OnlineShopping s1 = new OnlineShopping();

        try {

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Discount Percentage: ");
            double discount = sc.nextDouble();

            double bill = s1.calculateBill(price, quantity, discount);

            System.out.println("Final Bill Amount: " + bill);

            System.out.print("Enter Payment Amount: ");
            double payment = sc.nextDouble();

            s1.makePayment(bill, payment);

        }
        catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }
        catch (InputMismatchException e) {

            System.out.println("Error: Invalid input. Please enter numbers only.");

        }

        sc.close();
    }
}