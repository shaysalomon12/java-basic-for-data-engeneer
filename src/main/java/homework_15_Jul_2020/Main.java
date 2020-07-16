package homework_15_Jul_2020;

public class Main {

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.play(100);
        int bestResult = game.getBestResult();
        System.out.println("BestResult = " + bestResult);

    }
}
