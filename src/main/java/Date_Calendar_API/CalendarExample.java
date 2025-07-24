package Date_Calendar_API;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2023, Calendar.APRIL, 2, 13, 37);
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        Date resultDate = calendar.getTime();
        System.out.println("Дата після додавання 1 дня: " + resultDate);
    }
}

