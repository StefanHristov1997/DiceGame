import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello you start a dice game against your computer, please choose your number:");
        int playerNumber = scanner.nextInt();

        System.out.println("You choose: " + playerNumber);
        String playerName = "Player";

        Game playerGame = new Game();
        playerGame.play(playerName,playerNumber);
        int playerPoints = playerGame.getPoints();

        System.out.println("Now is computer turn to choose a number");
        String computerName = "Computer";
        int computerNumber = random.nextInt(6) + 1;

        System.out.println("Computer choose: " + computerNumber);

        Game computerGame = new Game();

        computerGame.play(computerName,computerNumber);

        int computerPoints = computerGame.getPoints();

        System.out.println("The final results are: player points: " + playerPoints + ", computer points: " + computerPoints);

        System.out.println("The winner is: ");

        if(playerPoints > computerPoints){
            System.out.println("Player");
        }else if(computerPoints > playerPoints){
            System.out.println("Computer");
        }else {
            System.out.println("The match is Draw!");
        }

    }
}
