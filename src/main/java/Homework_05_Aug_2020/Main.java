package Homework_05_Aug_2020;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        // Using springframework to scan all methods in classes implementing Regime interface
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
        Clock clock = context.getBean(Clock.class);


        String[] choices = {"modA", "modB", "modC"};
        String input = null;

        do {
            input = (String) JOptionPane.showInputDialog(null, "Choose Clock Mode", "Clock", JOptionPane.QUESTION_MESSAGE, null,
                    choices, // Array of choices
                    choices[0]); // Initial choice

            if (input.equals("modA")) {
                clock.modA();
            }
            else if (input.equals("modB")) {
                clock.modB();
            }
            else if (input.equals("modC")) {
                clock.modC();
            }
        } while (true);

    }
}
