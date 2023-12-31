package homework_week_08;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Use a class with the name MinAndMaxInputChallenge
 */

public class Programme2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        // Creating scanner
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // While loop
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break; // Exit the loop if an invalid number is entered
            }
            scanner.nextLine(); // Consume the newline character
        }

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
        // Scanner closing
        scanner.close();
    }
}
