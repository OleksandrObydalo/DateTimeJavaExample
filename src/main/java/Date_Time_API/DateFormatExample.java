package Date_Time_API;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        String formatted = now.format(formatter);
        System.out.println("Форматована дата ISO_LOCAL_DATE_TIME: " + formatted);
        System.out.println("Форматована дата ISO_DATE_TIME: " + now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Форматована дата ISO_WEEK_DATE: " + now.format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}

