package CaseStudyExceptionHandling;
import java.util.*;

class Case12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0)
                throw new Exception("Invalid withdrawal amount");

            if (amount > balance)
                throw new Exception("Insufficient balance");

            balance -= amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}