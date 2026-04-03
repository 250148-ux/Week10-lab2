package Problem4;

public class Main {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger();
        try {
            logger.writeLog("smth.txt", "Test time");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
