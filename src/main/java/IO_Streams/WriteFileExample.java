package IO_Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String text = "Hello I/O!";
        try (FileOutputStream fos = new FileOutputStream("data.txt")) {
            fos.write(text.getBytes());
            System.out.println("File is written.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

