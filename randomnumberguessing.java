import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        System.out.print("Guess the number (between 1 and 100): ");
        int userGuess = scanner.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } 
        else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high.");
        } 
        else {
            System.out.println("Your guess is too low.");
        }

        System.out.println("The generated number was: " + randomNumber);

        scanner.close();
    }
}

Input:
Guess the number (between 1 and 100): 50

Output:
Your guess is too low.
The generated number was: 78

    
