package Reader_Writer;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String message = "Hello Java I/O Streams!" +
                "\n Hello BufferedWriter! \n Hello BufferedReader!";

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
            int counter = 1;
            while ((line = br.readLine()) != null) {
                System.out.println("Прочитано рядок " + counter + " : " + line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

