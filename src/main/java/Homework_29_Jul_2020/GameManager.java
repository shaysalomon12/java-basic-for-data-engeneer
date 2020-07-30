package Homework_29_Jul_2020;

public class GameManager {

    public void fight(Hero player1, Hero player2) {
        // Print players when game starts
        System.out.println("******* Game started with 2 Heroes *******");
        this.print(player1, player2);

        // start kicking each other until death
        int numRounds = 1;
        // System.out.println("Player1 is alive: " + player1.isAlive());
        // System.out.println("Player2 is alive: " + player2.isAlive());

        while (player1.isAlive() & player2.isAlive()){
            System.out.println("**** Starting of round " + numRounds + " ****");
            // Player1 kicks Player2
            player1.kick(player2);
            System.out.println(player1.getName() + " kicked " + player2.getName());
            System.out.println("Player2 " + player2.getName() + " Current Power: " + player2.getPower());

            if (!player2.isAlive()){
                gameOver(player1, player2, numRounds);
                break;
            }
            // Player2 kicks Player1
            player2.kick(player1);
            System.out.println(player2.getName() + " kicked " + player1.getName());
            System.out.println("Player1 " + player1.getName() + " Current Power: " + player1.getPower());

            if (!player1.isAlive()){
                gameOver(player2, player1, numRounds);
                break;
            }
            System.out.println("****   End of round " + numRounds + "    ****");
            numRounds++;
            if (numRounds > 100){
                break;
            }
        }
    }

        private void print(Hero player1, Hero player2){
            // System.out.println("******************************************");
            System.out.println("Player1:");
            System.out.println("Name: " + player1.getName());
            System.out.println("Current Power: " + player1.getPower());
            System.out.println("Current HP: " + player1.getHp());
            System.out.println("******************************************");
            System.out.println("Player2:");
            System.out.println("Name: " + player2.getName());
            System.out.println("Current Power: " + player2.getPower());
            System.out.println("Current HP: " + player2.getHp());
            System.out.println("******************************************");
        }

        private void gameOver(Hero playerWinner, Hero playerLooser, int numRounds){
            System.out.println("***************************************************************************************");
            System.out.println("*** Game over !!! " + playerWinner.getName() + " killed " + playerLooser.getName() + " after " + numRounds + " rounds ***");
            System.out.println("***************************************************************************************");
            System.out.println("The Winner is: ");
            System.out.println("Name: " + playerWinner.getName());
            System.out.println("Current Power: " + playerWinner.getPower());
            System.out.println("Current HP: " + playerWinner.getHp());
            System.out.println("******************************************");
            System.out.println("The looser is: ");
            System.out.println("Name: " + playerLooser.getName());
            System.out.println("Current Power: " + playerLooser.getPower());
            System.out.println("Current HP: " + playerLooser.getHp());
            System.out.println("******************************************");
        }

        private void stopGame(Hero player1, Hero player2, int numRounds){
            System.out.println("*** Stop this redicilous game after " + numRounds + " rounds ***");
        }

}
