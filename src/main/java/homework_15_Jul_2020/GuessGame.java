package homework_15_Jul_2020;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GuessGame {

    private Integer[] bestResult = new Integer[10];
    private int score = 0;

    public void play(int max) {

        Random randomNumber = new Random();
        int x = randomNumber.nextInt(max);
        int gameNumber = 1;
        int answer = 0;
        // boolean cont;
        int numOfTries = 1;

        System.out.println(x);

        // Open a dialog box for the first time and and ask player to enter his guess
        answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Try number: " + numOfTries + ". Enter your number"));

        for (numOfTries = 2; numOfTries < 999999999; numOfTries++) {

            // Check if player guess is correct
            if (answer == x) {
                JOptionPane.showMessageDialog(null, "You did it in " + (numOfTries-1) + " tries. Well done!!!");
                bestResult[gameNumber+1] = max/(numOfTries-1);
                int cont = JOptionPane.showConfirmDialog(null, "Start new game?");
                System.out.println("Score: " + max/(numOfTries-1));
                if (cont == 0) {
                    this.play(max);
                }
                break;
            }

            if (answer < x) {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Number is too small. Try again. " + "Try number: " + numOfTries));
            }

            if (answer > x) {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Number is too big. Try again"  + "Try number: " + numOfTries));
            }

        }

    }

    public int getBestResult() {

        //int i;
        //for (i=1; i < bestResult.length; i++)
            System.out.println(Arrays.toString(bestResult));

        return 10;
    }
}
