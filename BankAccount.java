class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountNumber = 12345;
        account.accountHolderName = "Garv";
        account.balance = 5000;

        account.displayBalance();

        account.deposit(2000);

        account.withdraw(3000);

        account.displayBalance();

        account.withdraw(10000);
    }
}