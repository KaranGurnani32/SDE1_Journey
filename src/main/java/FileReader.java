import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) {

        try(BufferedReader reader = Files.newBufferedReader(Paths.get("input.txt"));
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("output.txt"))) {

            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
