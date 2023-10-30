package homework_week_08;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme8_SymbolTriangle {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        // closing scanner
        scanner.close();
    }
}
