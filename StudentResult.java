import java.util.*;

class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter 5 marks: ");

        int total = sc.nextInt() + sc.nextInt() + sc.nextInt()
                  + sc.nextInt() + sc.nextInt();

        int per = total / 5;

        System.out.println("\nName: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per + "%");

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

        if (per >= 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}