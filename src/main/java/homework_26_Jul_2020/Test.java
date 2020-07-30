package homework_26_Jul_2020;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {

        String dateString = "01/10/2018 15:40:00";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDate lDate = LocalDate.parse(dateString, format); // LocalDate will accept the String after parsed with the specified format
        LocalDateTime lDateTime = LocalDateTime.parse(dateString, format);
        System.out.println("lDate:     " + lDate);
        System.out.println("lDateTime: " + lDateTime);
        System.out.println("\n");

        // Set the output String format to be different than the input format
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH/mm/ss");
        String text = lDateTime.format(format1);
        LocalDateTime parsedDate1 = LocalDateTime.parse(text, format1);
        System.out.println("text                 : " + text);
        System.out.println("parsedDate1          : " + parsedDate1);
        System.out.println("parsedDate1 formatted: " + parsedDate1.format(format));

    }
}
