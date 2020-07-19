package homework_15_Jul_2020;

import java.util.ArrayList;

public class GamerService {

    // Create ArrayList of gamers
    private ArrayList<Gamer> gamers = new ArrayList<Gamer>();
    private Gamer gamer;

    // Class constructor doing nothing
    public GamerService() {
    }

    // Add Gamer
    public void addGamer(Gamer gamer) {
        this.gamer = gamer;
        gamers.add(gamer);
    }

    // Return max score result
    public int gamerBestResults() {
        int maxAll = 0;
        int i = 0;

        //for (i = 0; i < gamers.size(); i++)
        //    if (maxAll < gamers.get(i).getGamerScore()) {
        //        maxAll = gamers.get(i).getGamerScore();
        //    }

        // New-style for loop
        for (Gamer element : gamers) {
            if (maxAll < element.getGamerScore()) {
                maxAll = element.getGamerScore();
            }
        }
        return maxAll;

    }

    // Return max score name result
    public String gamerNameBestResults() {
        int maxAll = 0;
        int i = 0;
        String gamerName = "";

        //for (i = 0; i < gamers.size(); i++)
        //    if (maxAll < gamers.get(i).getGamerScore()) {
        //        maxAll = gamers.get(i).getGamerScore();
        //        gamerName = gamers.get(i).getGamerName();
        //    }

        // New-style for loop
        for (Gamer element : gamers) {
            if (maxAll < element.getGamerScore()) {
                maxAll = element.getGamerScore();
                gamerName = element.getGamerName();
            }
        }

        return gamerName;
    }

}
