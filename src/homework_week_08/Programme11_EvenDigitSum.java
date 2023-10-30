package homework_week_08;

import java.util.Scanner;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * PRIME TESTING
 * <p>
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Programme11_EvenDigitSum {
    public static void main(String[] args) {
        // Scanner created
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            int evenSum = getEvenDigitSum(number);

            // if else
            if (evenSum != -1) {
                System.out.println("Sum of even digits: " + evenSum);
            } else {
                System.out.println(evenSum);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        // Scanner closing
        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
