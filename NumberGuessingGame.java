//TASK 2::


import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rounds = 3;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + rounds + " rounds to play.");

        for (int round = 1; round <= rounds; round++) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 5;
            boolean isGuessed = false;

            System.out.println("\nRound " + round);
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + attempts + " attempts.");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    int score = attempts - attempt + 1;
                    System.out.println("You scored " + score + " points this round.");
                    totalScore += score;
                    isGuessed = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!isGuessed) {
                System.out.println("Sorry, you've used all attempts. The correct number was: " + randomNumber);
            }
        }

        System.out.println("\nGame Over! Your total score is: " + totalScore);
        scanner.close();
    }
}

