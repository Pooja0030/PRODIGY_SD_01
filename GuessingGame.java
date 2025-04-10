            import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Create Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Create Random object to generate random number
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;

        int guess; // User's guess
        int attempts = 0; // Number of tries

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until user guesses the number
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right.");
                System.out.println("It took you " + attempts + " attempts.");
            }

        } while (guess != numberToGuess);

        sc.close(); // Close scanner
    }
}
