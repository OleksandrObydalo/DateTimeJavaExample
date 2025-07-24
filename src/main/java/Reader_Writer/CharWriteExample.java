package Reader_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class CharWriteExample {
    public static void main(String[] args) {
        String data = "Hello Java I/O! Streams";
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

