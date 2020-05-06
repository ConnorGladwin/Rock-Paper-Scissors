// imports the methods that will be used in the program
import java.util.Random;
import java.util.Scanner;

// the main class of the program
public class rockPaperScissors {         
    public static void main(String[] args) {

        // declares the variables that will be used in the program
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int userChoice;
        int compChoice;
        int userScore = 0;
        int compScore = 0;

        // declares the scanner for input in the program
        Scanner reader = new Scanner(System.in);

        System.out.println("---Rock, Paper, Scissors---");
        System.out.println("Best of 3");

        // the main game loop
        while(userScore < 2 && compScore < 2) {

            // displays the users options and allows the user to select one
            System.out.println("Rock - 0 | Paper - 1 | Scissors - 2");
            System.out.print("Choice: ");
            userChoice = reader.nextInt();

            // declares the rng and randomly assigns a choice
            Random random = new Random();
            compChoice = random.nextInt(3);

            /* I had some trouble in the following code
            I had tried to use an OR operator but I kept
            recieving a syntax error stating "token yield expected"
            and thus I had to break my code down and remove the "or"
            operator*/

            // determines if the user won or not and counts the points recived
            if(userChoice == compChoice) {
                System.out.println("Tie! No points awarded!");
            }
            else if (userChoice == rock && compChoice == scissors) {
                System.out.println("You win! 1 point awarded to you!");
                userScore++;
            }
            else if (userChoice == scissors && compChoice == paper) {
            	System.out.println("You win! 1 point awarded to you!");
                userScore++;
            }
            else if (userChoice == paper && compChoice == rock) {
            	System.out.println("You win! 1 point awarded to you!");
                userScore++;
            }
            else {
                System.out.println("You lose! 1 point awarded to opponent!");
                compScore++;
            }
        }

        // displays a message telling the user if they won or not
        if (userScore >= 2) {
            System.out.print("Congratulations! You win!");
        }
        else {
            System.out.print("Unfortunately you lost... Better luck next time.");
        }
    }
}
