// import java.util.Scanner;
// public class HiLo {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         String playAgain = "";
//         do{
//         //Create a random number for the user to guess

//         int theNumber = (int)(Math.random() * 100);
//         //System.out.println(theNumber);
//         int guess = 0;
//         while (guess != theNumber) {
//         System.out.println("Guess a number between 1 and 100: ");
//         guess = scanner.nextInt();
//         if (guess < theNumber) 
//             System.out.println(guess + " is too low. Try again!");
//             else if (guess > theNumber) 
//                 System.out.println(guess + " is too high. Try again!");
//             else 
//                 System.out.println(guess + " is correct. You win!");
//         }// end of while loop
        
//         System.out.println("Would you like to play again (y/n)?"); 
//         playAgain = scanner.next();
//         }while (playAgain.equalsIgnoreCase("y"));
//         System.out.println("Thank you for playing! Goodbye.");
//         scanner.close();
//     }
// }


import java.util.Scanner;
public class GG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please enter a number between 1 and 10000:");

        int secretNumber = (int) (Math.random() * 10000) + 1;
        int lowerNumbers = 1;
        int upperNumbers = 10000;

        while (true) {
            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < lowerNumbers || userGuess > upperNumbers) {
                System.out.println("Please enter a number between " + lowerNumbers + " and " + upperNumbers + ".");
            } else if (userGuess < secretNumber) {
                System.out.println("Your guess is too low, try again.");
                lowerNumbers = userGuess + 1;
            } else if (userGuess > secretNumber) {
                System.out.println("Your guess is too high, try again.");
                upperNumbers = userGuess - 1;
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
                break;
            }
        }

        scanner.close();
    }
}
