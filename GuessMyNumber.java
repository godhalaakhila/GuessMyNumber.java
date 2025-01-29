import java.util.Random;

public class GuessMyNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        
        // Predefined guess (you can change this value to test different guesses)
        int guess = 50;  // A fixed guess to test (can be changed)
        
        // Print the target number for testing purposes (remove this in a real game)
        System.out.println("Target number (for testing): " + targetNumber);
        System.out.println("Guess (for testing): " + guess);

        // Check if the guess is correct
        if (guess == targetNumber) {
            System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
        } else if (guess < targetNumber) {
            System.out.println("Too low! The target number is higher.");
        } else {
            System.out.println("Too high! The target number is lower.");
        }
    }
}
 
    

