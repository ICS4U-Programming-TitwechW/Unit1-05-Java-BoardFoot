import java.util.Scanner;
/**
* Program asks user to guess
* a random number.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-27
*/

public final class BoardFoot {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Here to calculate the board foot length.
    *
    * @param width passed.
    * @param height passed.
    * @return length.
    */

    public static double calculateBoardFoot(double width, double height) {
        // Declare constant.
        final double ONE_BOARD_LENGTH = 144.0;

        // Calculate the length per one board foot.
        final double length = ONE_BOARD_LENGTH / (width * height);

        // Return users to main function.
        return length;
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */

    public static void main(String[] args) {
        // Variables
        final String userHeight;
        final String userWidth;
        final double boardLength;

        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input.
        System.out.println("Enter the width (inches): ");
        userWidth = scanner.nextLine();

        System.out.println("Enter the height (inches): ");
        userHeight = scanner.nextLine();

        try {
            // Convert string to double
            final double widthDoub = Double.parseDouble(userWidth);

            try {
                // Convert string to double
                final double heightDoub = Double.parseDouble(userHeight);

                if (widthDoub > 0 && heightDoub > 0) {
                    // Call the function
                    boardLength = calculateBoardFoot(widthDoub, heightDoub);

                    System.out.print("The wood should be ");
                    System.out.format("%.2f", boardLength);
                    System.out.println(" inches long");

                } else {
                    // If the input is to
                    System.out.println("Use a positive number");

                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Enter valid input."
                    + error.getMessage());
            }

        } catch (NumberFormatException error) {
            // Displays error to user.
            System.out.print("Please enter valid input."
                + error.getMessage());
        }

        // Close scanner
        scanner.close();

    }
}
