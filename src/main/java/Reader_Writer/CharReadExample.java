package Reader_Writer;

import java.io.FileReader;
import java.io.IOException;

public class CharReadExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

