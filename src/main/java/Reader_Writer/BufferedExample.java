package Reader_Writer;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String message = "Hello Java I/O Streams!";

        // Запис
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Зчитування
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Прочитано рядок: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

