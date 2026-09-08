import java.util.Scanner;

class Student {
    String name;
    String[] courses = new String[5];
    int count = 0;

    void registerCourse(String course) {
        if (count < 5) {
            courses[count] = course;
            count++;
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("Maximum 5 courses allowed.");
        }
    }

    void displayCourses() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Registered Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
}

public class case9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter course " + (i + 1) + ": ");
            String course = sc.nextLine();

            s.registerCourse(course);
        }

        s.displayCourses();

        sc.close();
    }
}