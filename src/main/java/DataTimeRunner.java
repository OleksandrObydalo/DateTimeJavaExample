import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DataTimeRunner {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
        System.out.println(Instant.ofEpochSecond(0));
        System.out.println(Instant.ofEpochMilli(12222230000l));

        System.out.println(instant.atZone(ZoneId.of("Africa/Tunis")));

        System.out.println(instant.plus(1, ChronoUnit.HOURS));
//        System.out.println(instant.plus(1, ChronoUnit.MONTHS)); //Causes Runtime error, as you can't add month to Instant
    }
}
