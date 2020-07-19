package homework_15_Jul_2020;
/*
In this homework I am implementing the same Class I used with Soldier + SoldierService
to create Gamer and GamerService
*/
import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int score =0;
        String gamerName;
        GuessGame game = new GuessGame();
        GamerService service = new GamerService();

        // Create the gamers
        gamerName = "Dan";
        Gamer gamer0 = new Gamer (gamerName, game.play(100, gamerName));
        service.addGamer(gamer0);

        gamerName = "Yulia";
        Gamer gamer1 = new Gamer (gamerName, game.play(100, gamerName));
        service.addGamer(gamer1);

        gamerName = "Alina";
        Gamer gamer2 = new Gamer (gamerName, game.play(100, gamerName));
        service.addGamer(gamer2);

        gamerName = "Rami";
        Gamer gamer3 = new Gamer (gamerName, game.play(100, gamerName));
        service.addGamer(gamer3);

        // Show best score by calling 2 functions because each can return a single value
        int bestScoreResult = service.gamerBestResults();
        String bestNameResult =  service.gamerNameBestResults();

        // System.out.println("BestResult = " + bestResult);
        //System.out.println("Best results are for : " + bestNameResult + " with score: " + bestScoreResult);
        JOptionPane.showMessageDialog(null, "Best results are for : " + bestNameResult + " with score: " + bestScoreResult);

    }
}
