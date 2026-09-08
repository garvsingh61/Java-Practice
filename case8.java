import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void displayManager() {
        display();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + (salary + bonus));
    }
}

public class case8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter manager name: ");
        m.name = sc.nextLine();

        System.out.print("Enter salary: ");
        m.salary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        m.bonus = sc.nextDouble();

        System.out.println("\nManager Details:");
        m.displayManager();

        sc.close();
    }
}
