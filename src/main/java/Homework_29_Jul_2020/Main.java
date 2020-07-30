package Homework_29_Jul_2020;

public class Main {

    public static void main(String[] args) {

        HeroFactory hf1 = new HeroFactory();
        HeroFactory hf2 = new HeroFactory();

        Hero player1 = new HeroFactory().createHero();
        Hero player2 = new HeroFactory().createHero();

        GameManager gm = new GameManager();
        gm.fight(player1, player2);
    }
}
