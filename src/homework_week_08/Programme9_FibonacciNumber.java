package homework_week_08;
/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Programme9_FibonacciNumber {
    public static void main(String[] args) {
        // Creating scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int first = 1, second = 1;

            if (n >= 1) {
                System.out.print(first);

                if (n >= 2) {
                    System.out.print(" " + second);

                    // for loop
                    for (int i = 3; i <= n; i++) {
                        int next = first + second;
                        System.out.print(" " + next);
                        first = second;
                        second = next;
                    }
                }
                System.out.println(); // Move to the next line
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        //Scanner closing
        scanner.close();
    }
}
