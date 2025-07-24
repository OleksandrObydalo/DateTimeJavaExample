package Date_Time_API;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        String formatted = now.format(formatter);
        System.out.println("Форматована дата: " + formatted);
    }
}

