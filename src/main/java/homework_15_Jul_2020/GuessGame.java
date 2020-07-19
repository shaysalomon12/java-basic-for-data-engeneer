package homework_15_Jul_2020;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GuessGame {

    // private Integer[] bestResult = new Integer[10];
    private int score = 0;

    public int play(int max, String name) {

        Random randomNumber = new Random();
        int x = randomNumber.nextInt(max);
        int answer = 0;
        int numOfTries = 0;

        // System.out.println(x); // For debug

        // Show gamer name
        JOptionPane.showMessageDialog(null, name + " is playing");

        // Open a dialog box for the first time and and ask player to enter his guess
        answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number"));

        for (numOfTries = 1; numOfTries < 999999999; numOfTries++) {

            // Check if player guess is correct
            if (answer == x) {
                JOptionPane.showMessageDialog(null, "You did it in " + (numOfTries) + " tries. Well done!!!");
                score = max / (numOfTries);
                System.out.println(name + " scored: " + score);
                return score;
            }

            else if (answer < x) {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Number is too small. Try again. " + "Try number: " + (numOfTries+1)));
            }

            else if (answer > x) {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Number is too big. Try again" + "Try number: " + (numOfTries+1)));
            }

        }

    return score;
    }

}
