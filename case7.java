import java.util.Scanner;

class ATM {
    int pin = 1234;
    double balance = 10000;

    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: ₹" + amount);
    }

    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

public class case7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM a = new ATM();

        int attempts = 0;
        boolean correct = false;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (a.checkPin(enteredPin)) {
                correct = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
            }
        }

        if (correct) {

            int choice;

            do {
                System.out.println("\n1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Display Balance");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    a.withdraw(amount);

                } else if (choice == 2) {

                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    a.deposit(amount);

                } else if (choice == 3) {

                    a.displayBalance();

                } else if (choice == 4) {

                    System.out.println("Thank you.");

                } else {

                    System.out.println("Invalid choice.");
                }

            } while (choice != 4);

        } else {

            System.out.println("Maximum attempts reached. Account blocked.");
        }

        sc.close();
    }
}