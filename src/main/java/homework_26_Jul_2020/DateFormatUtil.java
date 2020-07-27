package homework_26_Jul_2020;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatUtil {

    public static LocalDate convertStringToLocalDate(String date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, format);

    }

    public static String convertLocalDateToString(LocalDate date) {
        return date.toString();
    }

    public static String convertLocalDateTimeToString(LocalDateTime date) {
        return date.toString();
    }


    public static LocalDateTime convertStringToLocalDateTime(String date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(date, format);

    }

}


