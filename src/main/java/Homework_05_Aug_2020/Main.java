package Homework_05_Aug_2020;

import javax.swing.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
Regime          modA          modB
======          ====          ====
Clock           Hour          Minutes
Calender        Year          Day/Month
Alarm           Hour+Min      Stop Alarm
 */
public class Main {

    public static void main(String[] args) {

        // Using springframework to scan all methods in classes implementing Regime interface
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
        Clock clock = context.getBean(Clock.class);


        String[] choices = {"modA", "modB", "modC"};
        String input;

        do {
            input = (String) JOptionPane.showInputDialog(null, "Choose Clock Mode", "Clock", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice

            switch (input) {
                case "modA":
                    clock.modA();
                    break;
                case "modB":
                    clock.modB();
                    break;
                case "modC":
                    clock.modC();
                    break;
            }
        } while (true);

    }
}
