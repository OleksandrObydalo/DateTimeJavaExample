package Date_Calendar_API;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Поточна дата: " + date);

        long millis = date.getTime();
        System.out.println("Мілісекунди від 1970: " + millis);
    }
}

