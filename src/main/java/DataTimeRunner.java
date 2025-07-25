import java.time.*;
import java.time.temporal.ChronoUnit;

public class DataTimeRunner {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant:");
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
        System.out.println(Instant.ofEpochSecond(0));
        System.out.println(Instant.ofEpochMilli(12222230000l));

        System.out.println(instant.atZone(ZoneId.of("Africa/Tunis")));

        System.out.println(instant.plus(1, ChronoUnit.HOURS));
//        System.out.println(instant.plus(1, ChronoUnit.MONTHS)); //Causes Runtime error, as you can't add month to Instant

        System.out.println("LocalDateTime:");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plus(1, ChronoUnit.MONTHS));

        Duration duration = Duration.ofDays(1);
        System.out.println("Day has " + duration.getSeconds() + " seconds");

        Period period = Period.of(1, 2, 25);
        System.out.println(period.plusDays(5).plusMonths(6));
    }
}
