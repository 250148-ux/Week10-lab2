package Problem3;
import java.io.*;

public class StudentFileWriter {
    public static void main(String[] args){
        File file = new File("students.txt");

        if (file.exists()) {
            System.out.println("Warning: students.txt already exists. Overwriting.");
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Abdulloh Kozimov 4.4 ComputerScience");
            writer.println("John Smith 3.50 Mathematics");
            writer.println("Maria Garcia 3.92 Physics");
            writer.println("Chen Wei 3.71 Engineering");
            writer.println("Sara Johnson 3.60 Biology");

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
