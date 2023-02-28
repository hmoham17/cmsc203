import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess, lowGuess = 0, highGuess = 100;
        RNG.resetCount();
        int targetNumber = RNG.rand();
        boolean correctGuess = false;
        
        do {
            System.out.println("Enter your guess between " + lowGuess + " and " + highGuess + ": ");
            guess = input.nextInt();
            
            if (RNG.inputValidation(guess, lowGuess, highGuess)) {
                if (guess == targetNumber) {
                    System.out.println("Congratulations, you guessed correctly!");
                    correctGuess = true;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                    lowGuess = guess;
                } else {
                    System.out.println("Your guess is too high.");
                    highGuess = guess;
                }
                
                System.out.println("Number of guesses is: " + RNG.getCount() + ".");
            }
            
        } while (!correctGuess && RNG.getCount() < 7);
        
        if (!correctGuess) {
            System.out.println("Sorry, you have exceeded the maximum number of guesses, 7.");
        }
        else {
            System.out.println("Do you want to try again? (yes/no)");
            String playAgain = input.next();
            if(playAgain.equalsIgnoreCase("yes")) {
                main(args);
            }
            else {
                System.out.println("Thanks for playing.");
            }
        }
    }
}
