package homework_15_Jul_2020;

public class Gamer {

    private String gamerName;
    private int gamerScore;

    // Class constructor to force name and score
    public Gamer(String name, int score) {
        this.gamerName = name;
        this.gamerScore = score;
    }

    // Getters and Setters
    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public int getGamerScore() {
        return gamerScore;
    }

    public void setGamerScore(int gamerScore) {
        this.gamerScore = gamerScore;
    }


}
