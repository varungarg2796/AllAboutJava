import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        //Variables
        Random randomNumber = new Random();
        Scanner kbd = new Scanner(System.in);
        int computerValue;
        int numberOfTries = 0;
        int success = 0;
        int guess;
        boolean playAgain;
        //Logic and While Loop
        do {
            computerValue = randomNumber.nextInt(100);
            guess = 0;
            playAgain = false;
            while (guess != computerValue) {
                System.out.println("Please enter an integer betwen 1 and 100 inclusive: ");
                guess = kbd.nextInt();
                numberOfTries++;
                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input");
                } else if (guess < computerValue) {
                    System.out.println("Your guess is too low!");
                } else if (guess > computerValue) {
                    System.out.println("Your guess is too high!");
                }
            }
            success++;
            System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + computerValue);
            System.out.println("Would you like to play again?");
            switch (kbd.next()) {
                case "yes":
                    playAgain = true;
                    break;
                default:
                    break;
            }
        } while (playAgain);
        System.out.println("Goodbye");
    }
}