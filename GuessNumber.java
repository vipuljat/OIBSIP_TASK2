

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        startGuessingGame();
    }

    public static void startGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        int guess;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between " + minNumber + " and " + maxNumber + ".");
        System.out.println("Let's see if you can guess it!");

        while (!guessed) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts!");
                guessed = true;
            } else if (guess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
