
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            String playerA;
            String playerB;

            // Get Player A's move
            do {
                System.out.print("Player A, enter R, P, or S: ");
                playerA = input.nextLine().trim().toUpperCase();

                if (!playerA.equals("R") &&
                        !playerA.equals("P") &&
                        !playerA.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!playerA.equals("R") &&
                    !playerA.equals("P") &&
                    !playerA.equals("S"));

            // Get Player B's move
            do {
                System.out.print("Player B, enter R, P, or S: ");
                playerB = input.nextLine().trim().toUpperCase();

                if (!playerB.equals("R") &&
                        !playerB.equals("P") &&
                        !playerB.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!playerB.equals("R") &&
                    !playerB.equals("P") &&
                    !playerB.equals("S"));

            // Determine the winner
            if (playerA.equals(playerB)) {
                System.out.println("It's a Tie!");
            } else if (
                    (playerA.equals("R") && playerB.equals("S")) ||
                            (playerA.equals("S") && playerB.equals("R"))) {
                System.out.println("Rock breaks Scissors!");
                if (playerA.equals("R")) {
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Player B wins!");
                }
            } else if (
                    (playerA.equals("P") && playerB.equals("R")) ||
                            (playerA.equals("R") && playerB.equals("P"))) {
                System.out.println("Paper covers Rock!");
                if (playerA.equals("P")) {
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Player B wins!");
                }
            } else {
                System.out.println("Scissors cuts Paper!");
                if (playerA.equals("S")) {
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Player B wins!");
                }
            }

            // Ask to play again
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = input.nextLine().trim();

                if (!playAgain.equalsIgnoreCase("Y") &&
                        !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N"));
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}

