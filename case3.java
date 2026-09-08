import java.util.Scanner;

class employee {
    int employeeId;
    String name;
    double basicsalary;

    double calculateHRA() {
        return basicsalary * 0.20;
    }

    double calculateDA() {
        return basicsalary * 0.10;
    }

    double grossSalary() {
        return basicsalary + calculateHRA() + calculateDA();
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + grossSalary());
    }
}

public class case3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        employee e = new employee();

        System.out.print("Enter employee ID: ");
        e.employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        e.name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        e.basicsalary = sc.nextDouble();

        e.display();

        sc.close();
    }
}
