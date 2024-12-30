import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        // Variable to track the number of attempts
        int attempts = 0;
        
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;  // Variable to store the user's guess
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            // Provide feedback to the user
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

        // Congratulate the user when the correct number is guessed
        System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");
        
        // Close the scanner
        scanner.close();
    }
}
