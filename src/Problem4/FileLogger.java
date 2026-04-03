package Problem4;
import java.io.PrintWriter;

public class FileLogger {
    public void writeLog(String fileName, String message) throws Exception {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(new java.util.Date() + " - " + message);
            throw new RuntimeException("Simulated write error");
        } finally {
            // finally always runs even if an exception is thrown,
            // so the writer is guaranteed to close — no resource leak
            System.out.println("Logger closed.");
        }
    }
}
