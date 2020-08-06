package Homework_05_Aug_2020;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class RegimeCalander implements Regime {

    // Constructor is doing nothing
    public RegimeCalander() {
    }

    @Override
    public void modA() {
        // Print Year
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Clock year is: " + dtf.format(now));
    }

    @Override
    public void modB() {
        // Print Day
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Clock day is: " + dtf.format(now));
    }

    @Override
    public void printRegimeName() {
        System.out.println("*** Current regime is CALENDER ***");
    }
}
