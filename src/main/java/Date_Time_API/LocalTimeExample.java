package Date_Time_API;

import java.time.LocalTime;
public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(12, 30, 45);
        System.out.println("Зараз: " + now);
        System.out.println("Створений час: " + time);
    }
}

