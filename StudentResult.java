import java.util.Scanner;

class StudentResult {

    String name;
    int total;
    int per;

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter 5 marks: ");
        total = sc.nextInt() + sc.nextInt() + sc.nextInt()
              + sc.nextInt() + sc.nextInt();
    }

    void percentage() {
        per = total / 5;
    }

    void grade() {
        if (per >= 90)
            System.out.println("Grade: A+");
        else if (per >= 80)
            System.out.println("Grade: A");
        else if (per >= 70)
            System.out.println("Grade: B");
        else if (per >= 60)
            System.out.println("Grade: C");
        else if (per >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    void result() {
        if (per >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per + "%");
    }

    public static void main(String[] args) {

        StudentResult s = new StudentResult();

        s.input();
        s.percentage();
        s.display();
        s.grade();
        s.result();
    }
}