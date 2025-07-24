package Date_Time_API;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate customDate = LocalDate.of(2023, Month.MAY, 11);
        System.out.println("Сьогодні: " + today);
        System.out.println("Задана дата: " + customDate);
    }
}

