import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter students name: ");
        for (int i = 0; i < count; i++) {
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("\nStudent Names:");
        for (String student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}