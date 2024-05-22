import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerRange = 1;
        int upperRange = 100;
        int attempts = 5;
        int score = 0;

        while (true) {
            int guessNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            System.out.println("I've picked a number between " + lowerRange + " and " + upperRange);

            int noOfAttempts = 0;
            while (noOfAttempts < attempts) {
                noOfAttempts++;
                System.out.print("Guess a number: ");
                int guessing = scanner.nextInt();

                if (guessing == guessNumber) {
                    System.out.println(
                            "Congratulations! You guessed the correct number in " + noOfAttempts + " attempts!");
                    score++;
                    break;
                } else if (guessing < guessNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("Final score is: " + score);
        scanner.close();
    }
}