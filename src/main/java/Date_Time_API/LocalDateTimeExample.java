package Date_Time_API;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime
                .of(2025, Month.JULY, 24, 15, 30, 25, 42);
        System.out.println(localDateTime);
    }
}
