import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class guessNumber {
    public static void main(String[] args) {

    
    Scanner sc =new Scanner(System.in);
    Random rand = new Random();

    int secretNumber = rand.nextInt(100) + 1;
    int maxAttempts = 7;
    int attempts = 0;
    boolean hasWon = false;
    System.out.println("==================================");
    System.out.println("Welcome to the Guess the Number Game!");
    System.out.println("==================================");
    System.out.println("I am thinking of a number between 1 and 100. \n  You have " + maxAttempts + " attempts to guess it.");

    while (attempts < maxAttempts && !hasWon) {
        try { System.out.println("Attempt " + ( attempts + 1) + " / " + maxAttempts + "\n" + "Enter your Guess: ");
        int guess = sc.nextInt();
        attempts++;
        if (guess < 1 || guess > 100) {
         System.out.println("Please enter a number between 1 and 100.");}
         else if (guess < secretNumber) {
         System.out.println("Too low! Try again.");
         } else if (guess > secretNumber) {
         System.out.println("Too high! Try again.");
         } else { hasWon = true;
         System.out.println("Congratulations! You guessed the number.");

         }

        }
         catch (InputMismatchException e) {
         System.out.println("Invalid input! Please enter a valid number.");
         sc.nextLine();
         }
    }
  if (!hasWon) {
        System.out.println("Sorry, you've used all your attempts. The number was: " + secretNumber);
    }
    sc.close();       

}
}