package Problem3;
import java.io.*;
import java.util.Scanner;

public class StudentFileReader {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("students.txt"))) {
            System.out.printf("%-20s %-6s %-15s%n", "Name", "GPA", "Major");
            System.out.println("------------------------------------------");

            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                Scanner lineScanner = new Scanner(line);

                String firstName = lineScanner.next();
                String lastName  = lineScanner.next();
                String gpa       = lineScanner.next();
                String major     = lineScanner.next();
                String name = firstName + " " + lastName;

                System.out.printf("%-20s %-6s %-15s%n", name, gpa, major);
                count++;
            }

            System.out.println("------------------------------------------");
            System.out.println("Total students: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt not found");
        }

    }
}
