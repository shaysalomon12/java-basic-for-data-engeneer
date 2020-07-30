package Homework_29_Jul_2020;

public class Main {

    public static void main(String[] args) {

        Hero player1 = new HeroFactory().createHero();
        Hero player2 = new HeroFactory().createHero();

        System.out.println("********* START GAME ************");

        GameManager gm = new GameManager();
        gm.fight(player1, player2);

        System.out.println("********* GAME OVER ************");
    }
}
