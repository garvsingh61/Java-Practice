import java.util.*;

public class Withdrawal {

    int balance = 100000;

    void withdraw(int amount) {

        if (amount > balance)
            throw new ArithmeticException("Insufficient Fund");

        if (amount < 0)
            throw new ArithmeticException("Invalid Amount");

        balance = balance - amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Withdrawal p1 = new Withdrawal();

        try {

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            p1.withdraw(amount);

        }
        catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }
        catch (InputMismatchException e) {

            System.out.println("Error: Invalid input. Please enter a number.");

        }

        sc.close();
    }
}