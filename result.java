import java.util.*;

public class result {

    void calculateAverage(int[] marks) {

        if (marks.length == 0)
            throw new ArithmeticException("No subjects entered");

        int sum = 0;

        for (int mark : marks) {

            if (mark < 0 || mark > 100)
                throw new ArithmeticException("Marks must be between 0 and 100");

            sum = sum + mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        result s1 = new result();

        try {

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            int[] marks = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            s1.calculateAverage(marks);

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