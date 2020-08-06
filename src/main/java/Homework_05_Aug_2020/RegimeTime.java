package Homework_05_Aug_2020;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class RegimeTime implements Regime {

    // Constructor is doing nothing
    public RegimeTime() {
    }

    @Override
    public void modA() {
        // Print time without seconds
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Clock Time in hours is: " + dtf.format(now));
    }

    @Override
    public void modB() {
        // Print seconds
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Clock Time in minutes is: " + dtf.format(now));
    }

    @Override
    public void printRegimeName() {
        System.out.println("*** Current regime is TIME ***");
    }
}
