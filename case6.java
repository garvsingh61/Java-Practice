import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");
        System.out.print("Condition: ");
        checkFever();
    }
}

public class case6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.print("Enter patient ID: ");
        p.patientId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter patient name: ");
        p.name = sc.nextLine();

        System.out.print("Enter patient age: ");
        p.age = sc.nextInt();

        System.out.print("Enter temperature: ");
        p.temperature = sc.nextDouble();

        System.out.println("\nPatient Details:");
        p.display();

        sc.close();
    }
}