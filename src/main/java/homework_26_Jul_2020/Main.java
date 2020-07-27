package homework_26_Jul_2020;

import home_work_22_Jul_2020.MyDate;

import javax.swing.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // To format the date to dd MMM yyyy
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter formattersT = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        // Initialize our DateFormatUtil Class
        DateFormatUtil dfu = new DateFormatUtil();

        // 1. Input date as String (dd/MM/yyyy)
        String inputDate1 = "26/07/2020";
        LocalDate ld = dfu.convertStringToLocalDate(inputDate1);

        // Format output to "26 Jul 2020"
        String text = ld.format(formatters);
        LocalDate parsedDate1 = LocalDate.parse(text, formatters);
        System.out.println("*** Converting String to LocalDate ***");
        System.out.println("Input string date: " + inputDate1);
        System.out.println("Output LocalDate: " + parsedDate1.format(formatters) + "\n");

        // 2. Input date as LocalDate.
        String inputDate2 = "2020-07-26";
        LocalDate ldate = LocalDate.parse(inputDate2);
        String strDate = dfu.convertLocalDateToString(ldate);

        // Format output to "26 Jul 2020
        strDate = ld.format(formatters);
        LocalDate parseDate2 = LocalDate.parse(strDate, formatters);

        System.out.println("*** Converting LocalDate to String ***");
        System.out.println("Input LocalDate: " + inputDate2);
        System.out.println("Output string date: " + parseDate2.format(formatters) + "\n");

        // 3. Input date as LocalDateTime
        String inputDate3 = "2020-07-26T10:11:00";
        LocalDateTime ldt = LocalDateTime.parse(inputDate3);
        String strDateTime = dfu.convertLocalDateTimeToString(ldt);

        // Format output to "26 Jul 2020 10:11:00"
        strDateTime = ldt.format(formattersT);
        LocalDateTime parseDate3 = LocalDateTime.parse(strDateTime, formattersT);

        System.out.println("*** Converting LocalDateTime to String ***");
        System.out.println("Input LocalDate: " + inputDate3);
        System.out.println("Output string Date: " + parseDate3.format(formattersT) + "\n");

        // 4. Input datetime as String (dd/MM/yyyy HH:mm:ss)
        String inputDate4 = "26/07/2020 14:30:00";
        LocalDateTime ldt1 = dfu.convertStringToLocalDateTime(inputDate4);

        // Format output to "26 Jul 2020 10:11:00"
        String text4 = ldt1.format(formattersT);
        LocalDateTime parsedDate4 = LocalDateTime.parse(text4, formattersT);

        System.out.println("*** Converting String to LocalDateTime ***");
        System.out.println("Input string date: " + inputDate4);
        System.out.println("Output LocalDate: " + parsedDate4.format(formattersT) + "\n");

    }

}
