package Homework_05_Aug_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class RegimeAlarm implements Regime{

    // Constructor is doing nothing
    public RegimeAlarm() {
    }

    @Override
    public void modA() {
        // Print alarm time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Clock alarm time was set to: " + dtf.format(now));
    }

    @Override
    public void modB() {
        // Print stopping alarm
        System.out.println("Stoppng alarm clock");
    }

    @Override
    public void printRegimeName() {
        System.out.println("*** Current regime is ALARM ***");
    }
}
