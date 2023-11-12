import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int numberOfDices;
    private final int circulations;

    private int points;
    private final Random random;
    private final Scanner scanner;

    public Game() {
        this.numberOfDices = 3;
        this.circulations = 5;
        this.points = 0;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public int getPoints() {
        return points;
    }

    public void play(String player, int target) {

        if (target < 1 || target > 6) {
            throw new IllegalArgumentException("Please choose a valid number between [1...6]");
        }

        int[] dices = new int[numberOfDices];

        for (int i = 0; i < circulations; i++) {
            for (int j = 0; j < numberOfDices; j++) {
                dices[j] = random.nextInt(6) + 1;
            }

            for (int dice : dices) {
                if (dice == target) {
                    points++;
                }
            }

            System.out.print("Dices for this round are: ");
            Arrays.stream(dices).forEach(dice -> System.out.printf("[%d] ", dice));

            System.out.println();

            System.out.println("Press ENTER for the next round");


            scanner.nextLine();
        }


        System.out.printf("%s points are: %d\n", player, points);

    }
}


